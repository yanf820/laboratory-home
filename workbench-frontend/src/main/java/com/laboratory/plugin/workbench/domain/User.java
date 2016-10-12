package com.laboratory.plugin.workbench.domain;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yim
 * Created by yf on 2016/8/30.
 */
@Entity
public class User extends BaseObject{
    @Id
    private Long id;
    private String name;
    @Reference
    private List<Role> roles;
    @Reference
    private List<Group> groups;

    public User(){}

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
        this.roles = new ArrayList<Role>();
        this.groups = new ArrayList<Group>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Role> getRoles() {
        return roles;
    }



    public List<Group> getGroups() {
        return groups;
    }

    public void appendGroup(Group group){
        this.groups.add(group);
    }

    public void appendRole(Role role){
        this.roles.add(role);
    }

}
