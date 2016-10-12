package com.laboratory.plugin.workbench.domain;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * Author: alvin
 * Date: 2016-08-26
 */
@Entity
public class Group extends BaseObject{
    @Id
    private Long id;
    private String groupName;

    public Group(){}

    public Group(Long id, String groupName) {
        this.id = id;
        this.groupName = groupName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

}
