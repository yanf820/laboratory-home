package com.mongo.morphia.operations.library.model;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * Created by yf on 2017/2/13.
 */
@Entity
public class Inventory {
    @Id
    private Integer id;
    private String sku;
    private String description;
    private Integer instock;

    @Override
    public String toString() {
        return "Inventory{" +
                "id=" + id +
                ", sku='" + sku + '\'' +
                ", description='" + description + '\'' +
                ", instock=" + instock +
                '}';
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getInstock() {
        return instock;
    }

    public void setInstock(Integer instock) {
        this.instock = instock;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
