package com.resteasy.operations.example.simple;

import javax.ws.rs.*;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.PathSegment;
import java.util.Set;

/**
 * @author yf
 * Created by yf on 2016/9/19.
 */

@Path("/library")
public class Library {

    @GET
    @Path("/books")
    public String getBooks(){
        return "book list";
    }

    @GET
    @Path("/books/{isbn}")
    public String getBook(@PathParam("isbn") String isbn){
        return "book with isbn : "+isbn;
    }

    @PUT
    @Path("/book/{isbn}")
    public void addBook(@PathParam("isbn") String isbn, @QueryParam("name") String name){

        System.out.println("add the book with name : "+name+", isbn : "+isbn);
    }

    @DELETE
    @Path("/book/{var: .*}/{isbn}")
    public void removeBook(@PathParam("isbn") String isbn,@PathParam("var") String var){
        System.out.println(var);
        System.out.println("the book with isbn : "+isbn+" has been removed");
    }

    @GET
    @Path("/book/{name}")
    public String getBook(@PathParam("name") Name name){
        return name.getName();
    }

    @POST
    @Path("/book/{multi}")
    public void postBook(@PathParam("multi") PathSegment multi){
        MultivaluedMap<String,String> paramMap =multi.getMatrixParameters();
        Set<String> set=paramMap.keySet();

        for (String key:set){
            System.out.println(key+" : "+paramMap.get(key));
        }
    }
}
