package com.laboratory.plugin.workbench.domain;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: alvin
 * Date: 2016-08-26
 */
@Entity
public class Role extends BaseObject{
    @Id
    private Long id;
    private String roleName;
    @Reference
    private List<Resource> resources;

    public Role(){}

    public Role(Long id, String roleName) {
        this.id = id;
        this.roleName = roleName;
        this.resources = new ArrayList<Resource>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void appenMenuItem(Resource resource){
        this.resources.add(resource);
    }


}
