package com.mongo.morphia.operations.library.model;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

import java.util.Date;
import java.util.List;

/**
 * Created by admin on 2017/2/12.
 */
@Entity
public class Order {
    @Id
    private String id;
    @Reference
    private List<Book> books;
    @Reference
    private Member member;
    private Double amount;
    private Date createTime;
    private Date updateTime;
    private String pay;

    public String getPay() {
        return pay;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", books=" + books +
                ", member=" + member +
                ", amount=" + amount +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", pay='" + pay + '\'' +
                '}';
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
