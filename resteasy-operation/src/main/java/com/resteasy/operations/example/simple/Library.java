package com.resteasy.operations.example.simple;

import javax.ws.rs.*;

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
}
