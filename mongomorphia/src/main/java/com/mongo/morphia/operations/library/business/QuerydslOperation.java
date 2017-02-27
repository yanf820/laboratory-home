package com.mongo.morphia.operations.library.business;

import com.mongo.morphia.operations.library.model.Book;
import com.mongo.morphia.operations.library.model.QBook;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.querydsl.core.types.Order;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.mongodb.morphia.MorphiaQuery;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import java.util.List;

/**
 * Created by admin on 2017/2/26.
 */
public class QuerydslOperation {
    static MongoClient mongoClient=new MongoClient(new ServerAddress("192.168.110.128"));
    static Morphia morphia = new Morphia();
    static Datastore datastore=morphia.createDatastore(mongoClient, "library");

//    void init(){
//        mongoClient=new MongoClient(new ServerAddress("192.168.110.128"));
////        morphia.mapPackage("com.mongo.morphia.operations.library.model");
//        morphia.createDatastore(mongoClient, "library");
//    }

    public static void main(String[] args) {
        QBook bookk=new QBook("bb");
//        MorphiaQuery<Book> query=new MorphiaQuery<Book>(morphia,datastore,book);
//        List<Book> books=query.where(book.id.eq("human")).fetch();
//        books.forEach(book1 -> System.out.println(book1.getName()));

//        QBook book=QBook.book;
//        MorphiaQuery<Book> query=new MorphiaQuery<Book>(morphia,datastore,book);
//        List<Book> books=query.where(book.id.eq("human")).fetch();
//        books.forEach(book1 -> System.out.println(book1.getName()));

        Path<Book> book= Expressions.path(Book.class,"person");
        Path<String> bookId=Expressions.path(String.class,book,"id");

        Path<String> bookISBN=Expressions.path(String.class,book,"ISBN");

        MorphiaQuery<Book> query=new MorphiaQuery<Book>(morphia,datastore,Book.class);
//        query.where(Expressions.predicate(Ops.EQ,bookId,Expressions.constant("human")))

        OrderSpecifier orderSpecifier=new OrderSpecifier(Order.ASC,bookId);
        List<Book> books=query.orderBy(orderSpecifier).fetch();
//        List<Book> books=query.where(Expressions.predicate(Ops.EQ,bookISBN,Expressions.constant("REDFFD9488332")))
//                .fetch();


        books.forEach(b -> System.out.println(b.getName()));
    }
}
