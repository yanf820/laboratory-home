package com.laboratory.plugin.workbench.util;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Pattern;

/**
 * @author yim
 * Created by yf on 2016/8/29.
 */
public class PackageScanner {

    private boolean excludeInner = true;

    private boolean checkInOrEx = true;

    private List<String> classFilter = null;

    public PackageScanner(){}

    public PackageScanner(boolean excludeInner, boolean checkInOrEx, List<String> classFilter) {
        this.excludeInner = excludeInner;
        this.checkInOrEx = checkInOrEx;
        this.classFilter = classFilter;
    }

    public Set<Class<?>> getPackageAllClasses(String basePackage,boolean recursive){

        Set<Class<?>> classes = new LinkedHashSet<Class<?>>();
        String packageName = basePackage;

        if (packageName.endsWith("."))
            packageName=packageName.substring(0,packageName.lastIndexOf('.'));

        String package2path = packageName.replace('.','/');

        Enumeration<URL> dirs;

        try {
            dirs=Thread.currentThread().getContextClassLoader().getResources(package2path);
            while (dirs.hasMoreElements()){
                URL url=dirs.nextElement();
                String protocol=url.getProtocol();
                if("file".equals(protocol)){
                    System.out.println("扫描file类型的class文件");
                    String filepath= URLDecoder.decode(url.getFile(),"UTF-8");
                    doScanPackageClassesByFile(classes, packageName, filepath,
                            recursive);
                }else if ("jar".equals(protocol)){
                    System.out.println("扫描jar类型的class文件");
                    doScanPackageClassesByJar(packageName, url, recursive,
                            classes);
                }
            }
        } catch (IOException e) {
            System.out.println(String.format("IOException error: %s",e));
        }
        return classes;
    }

    /**
     *
     * @param basePackage
     * @param url
     * @param recursive
     * @param classes
     */
    private void doScanPackageClassesByJar(String basePackage,URL url,final boolean recursive,Set<Class<?>> classes){String packageName = basePackage;
        String package2Path = packageName.replace('.', '/');
        JarFile jar;
        try {
            jar = ((JarURLConnection) url.openConnection()).getJarFile();
            Enumeration<JarEntry> entries = jar.entries();
            while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                String name = entry.getName();
                if (!name.startsWith(package2Path) || entry.isDirectory()) {
                    continue;
                }

                // 判断是否递归搜索子包
                if (!recursive
                        && name.lastIndexOf('/') != package2Path.length()) {
                    continue;
                }
                // 判断是否过滤 inner class
                if (this.excludeInner && name.indexOf('$') != -1) {
                    System.out.println("exclude inner class with name:" + name);
                    continue;
                }
                String classSimpleName = name
                        .substring(name.lastIndexOf('/') + 1);
                // 判定是否符合过滤条件
                if (this.filterClassName(classSimpleName)) {
                    String className = name.replace('/', '.');
                    className = className.substring(0, className.length() - 6);
                    try {
                        classes.add(Thread.currentThread()
                                .getContextClassLoader().loadClass(className));
                    } catch (ClassNotFoundException e) {
                        System.out.println(String.format("Class.forName error: %s", e));
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(String.format("IOException error: %s", e));
        }}

    private void doScanPackageClassesByFile(Set<Class<?>> classes,String packageName,String packagePath,boolean recursive){
        File dir = new File(packagePath);
        if (!dir.exists() || !dir.isDirectory()) {
            return;
        }
        final boolean fileRecursive = recursive;
        File[] dirfiles = dir.listFiles(new FileFilter() {
            // 自定义文件过滤规则
            public boolean accept(File file) {
                if (file.isDirectory()) {
                    return fileRecursive;
                }
                String filename = file.getName();
                if (excludeInner && filename.indexOf('$') != -1) {
                    System.out.println("exclude inner class with name:" + filename);
                    return false;
                }
                return filterClassName(filename);
            }
        });
        for (File file : dirfiles) {
            if (file.isDirectory()) {
                doScanPackageClassesByFile(classes, packageName + "."
                        + file.getName(), file.getAbsolutePath(), recursive);
            } else {
                String className = file.getName().substring(0,
                        file.getName().length() - 6);
                try {
                    classes.add(Thread.currentThread().getContextClassLoader()
                            .loadClass(packageName + '.' + className));

                } catch (ClassNotFoundException e) {
                    System.out.println(String.format("IOException error: %s", e));
                }
            }
        }
    }


    private boolean filterClassName(String className){
        if (!className.endsWith(".class"))
            return false;
        if (null==this.classFilter||this.classFilter.isEmpty())
            return true;
        String tmpName=className.substring(0,className.length()-6);
        boolean flag=false;
        for (String str: classFilter){
            String tmpreg="^"+str.replace("*",".*")+"$";
            Pattern pattern=Pattern.compile(tmpreg);
            if (pattern.matcher(tmpName).find()){
                flag=true;
                break;
            }
        }
      return (checkInOrEx&&flag)||(!checkInOrEx&&!flag);
    }
}
