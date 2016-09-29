package com.example.api;

import com.sun.codemodel.JCodeModel;
import org.jsonschema2pojo.*;
import org.jsonschema2pojo.rules.RuleFactory;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by yf on 2016/9/26.
 */
public class ApiOperation {

    public void simple(String path,String out) throws IOException {

        JCodeModel jCodeModel=new JCodeModel();
        URL source=new URL(path);

        GenerationConfig config = new DefaultGenerationConfig(){
            @Override
            public boolean isGenerateBuilders(){
                return true;
            }
            @Override
            public boolean isRemoveOldOutput() {
                return true;
            }
        };


        RuleFactory ruleFactory=new RuleFactory(config,new Jackson2Annotator(),new SchemaStore());
        SchemaMapper mapper=new SchemaMapper(ruleFactory,new SchemaGenerator());

        mapper.generate(jCodeModel,"ClassName","com.example.out",source);

        jCodeModel.build(new File(out));
    }
}
