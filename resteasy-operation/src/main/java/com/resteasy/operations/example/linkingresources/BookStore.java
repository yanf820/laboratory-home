package com.resteasy.operations.example.linkingresources;

import com.resteasy.operations.example.linkingresources.entity.Book;
import org.jboss.resteasy.links.AddLinks;
import org.jboss.resteasy.links.LinkResource;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

/**
 * Created by yf on 2016/9/20.
 */
@Path("/")
@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public interface BookStore {

    @AddLinks
    @LinkResource(value=Book.class)
    @GET
    @Path("books")
    public Collection<Book> getBooks();

    @LinkResource
    @POST
    @Path("books")
    public void addBook(Book book);

    @AddLinks
    @LinkResource
    @GET
    @Path("book/{id}")
    public Book getBook(@PathParam("id") String id);


    @LinkResource
    @PUT
    @Path("book/{id}")
    public void updateBook(@PathParam("id") String id, Book book);


    @LinkResource(value = Book.class)
    @DELETE
    @Path("book/{id}")
    public void deleteBook(@PathParam("id") String id);

}
