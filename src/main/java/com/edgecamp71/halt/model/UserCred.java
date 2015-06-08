package com.edgecamp71.halt.model;

import com.edgecamp71.halt.io.Model;

import javax.persistence.*;

@Entity
@Table
public class UserCred extends Model<UserCred> {

    private Long id;
    private String username;
    private String password;

    @Id
    @GeneratedValue
    @Column
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
