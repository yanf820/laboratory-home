package com.resteasy.operations.example.linkingresources.impl;

import com.resteasy.operations.example.linkingresources.BookStore;
import com.resteasy.operations.example.linkingresources.entity.Book;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by yf on 2016/9/20.
 */
public class BookStoreImpl implements BookStore {
    public Collection<Book> getBooks() {

        List<Book> books=new ArrayList<Book>();
        for(int i=0;i<3;i++){
            Book book=new Book();
            book.setTitle("title :"+ i);
            books.add(book);
        }
        return books;
    }

    public void addBook(Book book) {

    }

    public Book getBook(String id) {
        return null;
    }

    public void updateBook(String id, Book book) {

    }

    public void deleteBook(String id) {

    }
}
