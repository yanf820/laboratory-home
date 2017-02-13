package com.mongo.morphia.operations.library.model;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * Created by yf on 2017/2/13.
 */
@Entity
public class JoinOrder {
    @Id
    private Integer id;
    private String item;
    private Double price;
    private Integer quantity;

    @Override
    public String toString() {
        return "JoinOrder{" +
                "id='" + id + '\'' +
                ", item='" + item + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
