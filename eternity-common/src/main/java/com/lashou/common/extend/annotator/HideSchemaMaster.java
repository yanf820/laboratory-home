package com.lashou.common.extend.annotator;

import com.fasterxml.jackson.databind.JsonNode;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JEnumConstant;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMethod;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.jsonschema2pojo.Annotator;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by admin on 2016/12/22.
 */
public class HideSchemaMaster implements Annotator {
    @Override
    public void propertyOrder(JDefinedClass clazz, JsonNode propertiesNode) {

    }

    @Override
    public void propertyInclusion(JDefinedClass clazz, JsonNode schema) {
        clazz.hide();
    }
    @Override
    public void propertyField(JFieldVar field, JDefinedClass clazz, String propertyName, JsonNode propertyNode) {
    }

    @Override
    public void propertyGetter(JMethod getter, String propertyName) {

    }

    @Override
    public void propertySetter(JMethod setter, String propertyName) {

    }

    /*
    main
     */
    public static void main(String[] args) throws IOException {
        File file=new File("F:\\迅雷下载\\apks\\s-api-gateway-master-c51cf147a62aa1abb4f42bad468de35e066f0916\\raml\\schemas");
        File[] files=file.listFiles();
        for(File f: files) {
            File newFile = new File(f.getParent()+"\\new_schemas\\"+f.getName());
            List<String> lines=FileUtils.readLines(f,"UTF-8");
            for (String l:lines){
                StringBuffer newL=new StringBuffer("");
                if (StringUtils.contains(l,"$ref")){
                    int slot=l.indexOf("\"",l.indexOf(":",l.indexOf("$ref\"")));
                    newL.append(l.substring(0,slot+1)).append("#/schemas/").append(l.substring(slot+1));
                }else
                    newL=new StringBuffer(l);

                FileUtils.write(newFile,newL,true);

            }
        }
    }
    @Override
    public void anyGetter(JMethod getter) {

    }

    @Override
    public void anySetter(JMethod setter) {

    }

    @Override
    public void enumCreatorMethod(JMethod creatorMethod) {

    }

    @Override
    public void enumValueMethod(JMethod valueMethod) {

    }

    @Override
    public void enumConstant(JEnumConstant constant, String value) {

    }

    @Override
    public boolean isAdditionalPropertiesSupported() {
        return false;
    }

    @Override
    public void additionalPropertiesField(JFieldVar field, JDefinedClass clazz, String propertyName) {

    }
}
