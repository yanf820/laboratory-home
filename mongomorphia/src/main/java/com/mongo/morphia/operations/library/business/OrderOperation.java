package com.mongo.morphia.operations.library.business;

import com.mongo.morphia.operations.library.model.Address;
import com.mongo.morphia.operations.library.model.Book;
import com.mongo.morphia.operations.library.model.Member;
import com.mongo.morphia.operations.library.model.Order;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by admin on 2017/2/12.
 */
public class OrderOperation {

    MongoClient mongoClient;
    Morphia morphia = new Morphia();
    Datastore datastore;

    void init(){
        mongoClient=new MongoClient(new ServerAddress("192.168.110.128"));
        morphia.mapPackage("com.mongo.morphia.operations.library.model");
        datastore=createDBS("library");
    }

    public static void main(String[] args) {

        OrderOperation orderOperation=new OrderOperation();
        orderOperation.init();
        orderOperation.saveOrder();
//        orderOperation.updateAddress();
//        orderOperation.updateOrder();
        orderOperation.addOrderAfterUpdateBook();
//        orderOperation.queryAddress();
        orderOperation.queryOrder();
    }

    private Datastore createDBS(String dbsName){
        return morphia.createDatastore(mongoClient, dbsName);
    }

    private boolean saveOrder(){
        Address address=new Address();
        address.setCountry("CHINA");
        address.setProvince("ANHUI");
        address.setCity("LUAN");
        address.setDetailStreet("No.158,Land street");

        Member member=new Member();
        member.setId("yan");
        member.setName("yanfang");
        member.setAddress(address);
        member.setTelno("423432423");

        datastore.save(member);

        List<Book> books=new ArrayList<>();

        Book book1=new Book();
        book1.setId("human");
        book1.setName("人类简史");
        book1.setISBN("QJWI8999312");
        book1.setAllowance(100);
        book1.setAuthors(new ArrayList<String>(){{
            add("Asie");
            add("Walter");
        }});
        book1.setRent(3.45);

        datastore.save(book1);

        Book book2=new Book();
        book2.setId("universe");
        book2.setName("果壳中的宇宙");
        book2.setISBN("REDFFD9488332");
        book2.setAllowance(39);
        book2.setAuthors(new ArrayList<String>(){{
            add("Hawking");
        }});
        book2.setRent(4.10);

        datastore.save(book2);

        books.add(book1);
        books.add(book2);

        Order order=new Order();
        order.setId("UEOTIKDEW9999132193");
        order.setBooks(books);
        order.setMember(member);
        order.setAmount(books.stream().mapToDouble(book -> book.getRent()).sum());
        order.setCreateTime(new Date());

        datastore.save(order);

        return true;
    }

    private boolean updateAddress(){
        Query<Member> query=datastore.createQuery(Member.class)
                      .filter("_id","yan");
        UpdateOperations<Member> updateOperations=datastore.createUpdateOperations(Member.class)
                      .set("address.city","WANGJING").set("address.province","BEIJING");
        datastore.update(query,updateOperations);
        return true;
    }

    private boolean updateOrder(){
        Query<Order> query=datastore.createQuery(Order.class)
                       .filter("_id","UEOTIKDEW9999132193");
//        List<Book> books=query.get().getBooks();
//        books.add(new Book(){{
//            setId("hh");
//            setAllowance(99);
//        }});
//        Book book=new Book(){{
//            setId("hh");
//            setAllowance(99);
//        }};
        UpdateOperations<Order> updateOperations=datastore.createUpdateOperations(Order.class)
//                       .set("books",query.get().getBooks().remove(0));
                         .push("pay","Wechat");
        datastore.update(query,updateOperations);
        return true;
    }

    private boolean addOrderAfterUpdateBook(){

        Query<Book> bookQuery=datastore.createQuery(Book.class)
                                .filter("_id","human");
        Book book=bookQuery.get();
        Member member=datastore.createQuery(Member.class)
                .filter("_id","yan").get();

        List<Book> books=new ArrayList<Book>(){{add(book);}};
        Order order=new Order();
        order.setId("UEOTIKDEW9999132194");
        order.setBooks(books);
        order.setMember(member);
        order.setAmount(books.stream().mapToDouble(b -> b.getRent()).sum());
        order.setCreateTime(new Date());

        datastore.save(order);

        UpdateOperations<Book> updateOperations=datastore.createUpdateOperations(Book.class)
                .set("allowance",book.getAllowance()-1);
        datastore.update(bookQuery,updateOperations);
        return true;
    }

    private boolean queryAddress(){
        Query<Member> query=datastore.createQuery(Member.class)
                .filter("address.country","CHINA");
        System.out.println(query.get());
        return true;
    }

    private boolean queryOrder(){
        Query<Book> bookQueryquery=datastore.createQuery(Book.class)
                .filter("ISBN","REDFFD9488332");
        Query<Order> orderQueryquery=datastore.createQuery(Order.class)
                .field("books").hasThisOne(bookQueryquery.get());
        System.out.println(orderQueryquery.get());
        return true;
    }



}
