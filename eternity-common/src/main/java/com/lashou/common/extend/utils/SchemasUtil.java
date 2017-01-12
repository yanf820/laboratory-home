package com.lashou.common.extend.utils;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;

import javax.xml.validation.Schema;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yf on 2017/1/12.
 */
public class SchemasUtil {

    /**
     * 将schema内容中$ref加上"#/schema/"
     * @param formatSchema
     * @return
     */
    public static String refToSchemaKeywordForString(String formatSchema){

        StringBuilder withKeyword=new StringBuilder("");

        List<String> newLines=new ArrayList<>();

        String[] lines=formatSchema.split("\n");

        for (String l:lines){
            StringBuffer newL=new StringBuffer("");
            if (StringUtils.contains(l,"$ref")){
                int slot=l.indexOf("\"",l.indexOf(":",l.indexOf("$ref\"")));
                newL.append(l.substring(0,slot+1)).append("#/schemas/").append(l.substring(slot+1)).append("\n");
            }else
                newL=new StringBuffer(l).append("\n");
            newLines.add(newL.toString());
        }

        for (String l: newLines){
            withKeyword.append(l);
        }

        return withKeyword.toString();

    }

    /**
     * 将schema文件中$ref加上"#/schema/"并输出
     * @param schema
     * @param outputfile
     * @throws IOException
     */
    public static void refToSchemaKeywordForFile(File schema,File outputfile) throws IOException {
        List<String> lines=FileUtils.readLines(schema,"UTF-8");

        for (String l:lines){

            StringBuffer newL=new StringBuffer("");
            if (StringUtils.contains(l,"$ref")){
                int slot=l.indexOf("\"",l.indexOf(":",l.indexOf("$ref\"")));
                newL.append(l.substring(0,slot+1)).append("#/schemas/").append(l.substring(slot+1)).append("\n");
            }else
                newL=new StringBuffer(l).append("\n");

            FileUtils.write(outputfile,newL,true);

        }
    }

    /**
     * 将schema文件夹下所有文件中$ref加上"#/schema/"并输出
     * @param directory
     * @param outputdir
     * @throws IOException
     */
    public static void refToSchemaKeywordForDirectory(File directory,File outputdir) throws IOException {
        File[] files=directory.listFiles();
        for(File f: files) {
            File newFile = new File(outputdir.getPath()+"\\"+f.getName());
            List<String> lines=FileUtils.readLines(f,"UTF-8");
            for (String l:lines){
                StringBuffer newL=new StringBuffer("");
                if (StringUtils.contains(l,"$ref")){
                    int slot=l.indexOf("\"",l.indexOf(":",l.indexOf("$ref\"")));
                    newL.append(l.substring(0,slot+1)).append("#/schemas/").append(l.substring(slot+1)).append("\n");
                }else
                    newL=new StringBuffer(l).append("\n");

                FileUtils.write(newFile,newL,true);

            }
        }
    }

    public static void main(String[] args) throws IOException {
        File schema=new File("F:\\迅雷下载\\apks\\s-api-gateway-master-c51cf147a62aa1abb4f42bad468de35e066f0916\\raml\\schemasss");
//        String content=FileUtils.readFileToString(schema);
//        System.out.println(content);
        SchemasUtil.refToSchemaKeywordForDirectory(schema,new File(schema.getParent()+"\\schemas"));

    }
}
