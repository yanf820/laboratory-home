package com.resteasy.operations.example.simple;

import com.resteasy.operations.example.linkingresources.entity.Book;
import org.jboss.resteasy.annotations.*;
import org.jboss.resteasy.annotations.Form;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
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
    @Path("/book/{isbn}{title}")
    public void addBook(@PathParam("isbn") int isbn,@PathParam("title") String title, @QueryParam("name") String name){

        System.out.println("add the book with name : "+name+", isbn : "+isbn + "title :"+title);
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

    //POST http://localhost:8080/operations/library/book==;name=EJB 3.0;title=Bill Burke
    @POST
    @Path("/book{multi}")
    public void postBook(@PathParam("multi") PathSegment multi){
        MultivaluedMap<String,String> paramMap =multi.getMatrixParameters();
        Set<String> set=paramMap.keySet();

        for (String key:set){
            System.out.println(key+" : "+paramMap.get(key));
        }
    }

    @PUT
    @Path("/books")
    public void updateBook(@MatrixParam("name") String name,@MatrixParam("title") String title){
        System.out.println("name :"+name+" ,title :"+title);
    }

    @POST
    @Path("/books-form1")
    public void addBookByForm(@FormParam("name") @DefaultValue("yimmm") String name,@FormParam("title") String title){
        System.out.println("name :"+name+" ,title :"+title);
    }

    @POST
    @Path("/books-form2")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void addBookByForm(MultivaluedMap<String,String> form){
        Set<String> set=form.keySet();

        for (String key:set){
            System.out.println(key+" : "+form.get(key));
        }
    }

    @POST
    @Path("/books-form3")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void addBookByForm(@Form Book book){
        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());
    }

    @GET
    @Path("encodeTest/{name}")
    public String testEncode(@Context javax.ws.rs.core.HttpHeaders headers,@PathParam("name") @Encoded String name){

        return name;
    }



}
