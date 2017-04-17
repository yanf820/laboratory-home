package com.mongo.morphia.operations.library.business;

import com.mongo.morphia.operations.library.model.Book;
import com.mongo.morphia.operations.library.model.Member;
import com.mongo.morphia.operations.library.model.QBook;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.querydsl.core.types.Ops;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.mongodb.morphia.MorphiaQuery;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import java.util.List;

/**
 * Created by yf on 2017/2/27.
 */
public class QDslOperation {
    static MongoClient mongoClient;
    static Morphia morphia = new Morphia();
    static Datastore datastore;

    static void init(){
        mongoClient=new MongoClient(new ServerAddress("10.1.36.219"));
        datastore=morphia.createDatastore(mongoClient,"startup");
    }
    public static void main(String[] args) {
        init();
//        MorphiaQuery<Member> query=new MorphiaQuery<Member>(morphia,datastore,Member.class);
////        datastore.save(new Member());
////        List<Member> books=query.offset(0).limit(1).fetch();
////        books.forEach(b->{
////            System.out.println(b);
////        });
//        Path<Member> path= Expressions.path(Member.class,"member");
//        Path<String> fieldPath=Expressions.path(String.class,path,"id");
//        String v="58bff09f6ab35933fc4c5ff6";
//        String field="id";
//        System.out.println(query.where(Expressions.predicate(Ops.EQ,
//                fieldPath,
//                Expressions.constant("id".equals(field) ? new ObjectId(v) : v))).fetchOne());
////         query.where(Expressions.predicate(Ops.EQ,fieldPath,Expressions.constant(new ObjectId(v)))).fetchOne());
//        Member member=new Member();
//        member.setName("yim");
//        member.setId("58bff09f6ab35933fc4c5ff6");
//        member.setTelno("1231231312");
//
//        datastore.save(member);
        Member member=datastore.find(Member.class,"authentication.type","email").get();
        System.out.println(member);
    }
}
