package com.realdolmen.course.web.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Frederik Van Herbruggen on 20/10/2016.
 */
@ManagedBean
@SessionScoped
public class RegistrationBean {

    @ManagedProperty("#{registeredUsers}")
    private RegisteredUsers db;

    private User user;

    private boolean editmode = true;
    @PostConstruct
    private void init(){
        user = new User();
    }

    public String register(){
        db.addUser(user);
        String name= user.getFirstName();
        user = new User();
        return "thanks?name="+name;
    }

    public String toggleEdit(){
        editmode = !editmode;
        return "form?faces-redirect=true";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public RegisteredUsers getDb() {
        return db;
    }

    public void setDb(RegisteredUsers db) {
        this.db = db;
    }

    public boolean getEditmode() {
        return editmode;
    }

    public void setEditmode(boolean editmode) {
        this.editmode = editmode;
    }
}
