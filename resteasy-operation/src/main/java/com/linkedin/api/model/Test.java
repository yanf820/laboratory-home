package com.linkedin.api.model;

import javax.validation.constraints.NotNull;

/**
 * Created by admin on 2016/12/17.
 */
public class Test {
    @NotNull
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
