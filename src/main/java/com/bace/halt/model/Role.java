package com.bace.halt.model;

import com.bace.halt.io.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Role extends Model {

    private Long id;
    private String name;
    private List<UserCred> userCreds = new ArrayList<>();
    private List<Permission> permissions = new ArrayList<>();

    @Id
    @Column
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column
    public List<UserCred> getUserCreds() {
        return userCreds;
    }

    public void setUserCreds(List<UserCred> userCreds) {
        this.userCreds = userCreds;
    }

    @Column
    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
