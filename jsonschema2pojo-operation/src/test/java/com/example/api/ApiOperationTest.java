package com.example.api; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import java.net.URL;

/** 
* ApiOperation Tester. 
* 
* @author <Authors name> 
* @since <pre>¾ÅÔÂ 29, 2016</pre> 
* @version 1.0 
*/ 
public class ApiOperationTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: simple(String path) 
* 
*/ 
@Test
public void testSimple() throws Exception { 

    ApiOperation apio=new ApiOperation();
    apio.simple("file:\\D:\\work\\Java\\idea-work\\laboratory-home\\jsonschema2pojo-operation\\json\\schema\\source.json",
            "D:\\work\\Java\\idea-work\\laboratory-home\\jsonschema2pojo-operation\\src\\main\\java");
} 


} 
