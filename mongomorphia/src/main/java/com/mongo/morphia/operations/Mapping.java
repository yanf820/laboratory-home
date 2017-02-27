package com.mongo.morphia.operations;

import com.mongo.morphia.operations.example.Employee;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;

import java.util.List;

/**
 * Created by admin on 2017/2/12.
 */
public class Mapping {

    MongoClient mongoClient=new MongoClient(new ServerAddress("10.1.36.219"));
    Morphia morphia = new Morphia();
    public Mapping() {
        morphia.mapPackage("com.mongo.morphia.operations.example");
    }

    public static void main(String[] args) {

        Mapping mapping=new Mapping();

        final Datastore datastore = mapping.createDBS("em");
        datastore.ensureIndexes();

        /**
         * save
         */
        Employee elmer = new Employee("yf", 40000.0);
        elmer.setId(new ObjectId(new String("elmer").getBytes()));
        final Employee daffy = new Employee("Daffy Duck", 40000.0);
        daffy.setId(new ObjectId(new String("daffy").getBytes()));
        Employee aa=new Employee("aa",30000);
        aa.setId(new ObjectId(new String("aa").getBytes()));
        daffy.setManager(aa);
        datastore.save(aa);
        datastore.save(daffy);

        final Employee pepe = new Employee("Pepé Le Pew", 45000.0);
        pepe.setId(new ObjectId(new String("pepe").getBytes()));
        Employee bb=new Employee("bb",5050);
        bb.setId(new ObjectId(new String("bb").getBytes()));
        pepe.setManager(bb);
        datastore.save(bb);
        datastore.save(pepe);

        List<Employee> reports=elmer.getDirectReports();
        reports.add(daffy);
        reports.add(pepe);

        elmer.setDirectReports(reports);

        mapping.save(datastore,elmer);

        /**
         * query all
         */
//        List<Employee> list=mapping.query(datastore,Employee.class);

        /**
         * conditions query
         */
        List<Employee> list = datastore.createQuery(Employee.class).filter("name","yf").asList();


        list.forEach(n->{
            System.out.println(n);
        });
    }

    private Datastore createDBS(String dbsName){
        return morphia.createDatastore(mongoClient, dbsName);
    }

    private <T> boolean save(Datastore datastore,T t){
        try {
            datastore.save(t);
        }catch (Exception ex){
            return false;
        }

        return true;
    }
    private <T> List<T> query(Datastore datastore,Class<T> clazz){

        Query<T> query = datastore.createQuery(clazz);
        List<T> list=query.asList();

        return list;
    }
}
