package com.realdolmen.course.web.controller;

import sun.awt.image.PixelConverter;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Frederik Van Herbruggen on 21/10/2016.
 */
@ManagedBean
@ApplicationScoped
public class RegisteredUsers implements Serializable {
    private List<User> registeredUsers;
    private int id;

    public RegisteredUsers() {
        registeredUsers = new ArrayList<User>();
    }

    public List<User> getRegisteredUsers() {
        return registeredUsers;
    }

    public void addUser(User b){
        registeredUsers.add(b);
    }

    public User getById(){
        return registeredUsers.get(id);
    }

    public List<User> getByIdList(){
        return Collections.singletonList(getById());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
