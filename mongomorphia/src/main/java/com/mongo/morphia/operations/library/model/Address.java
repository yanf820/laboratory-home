package com.mongo.morphia.operations.library.model;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * Created by admin on 2017/2/12.
 */
@Entity
public class Address {
    @Id
    private String id;
    private String country;
    private String province;
    private String city;
    private String detailStreet;

    @Override
    public String toString() {
        return "Address{" +
                "id='" + id + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", detailStreet='" + detailStreet + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDetailStreet() {
        return detailStreet;
    }

    public void setDetailStreet(String detailStreet) {
        this.detailStreet = detailStreet;
    }

}
