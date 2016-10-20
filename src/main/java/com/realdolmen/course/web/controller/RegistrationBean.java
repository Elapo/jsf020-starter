package com.realdolmen.course.web.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Frederik Van Herbruggen on 20/10/2016.
 */
@ManagedBean
@SessionScoped
public class RegistrationBean {

    private String firstName = "Frederik",
            lastName = "Van Herbruggen",
            dateOfBirth = "26/10/2016",
            gender = "male",
            email = "frederik.vanherbruggen@realdolmen.com",
            serviceLevel = "High";

    private Date dateOfBirthDate = new Date();
    @PostConstruct
    private void init(){

    }

    public String register(){
        System.out.println("Redirecting...");
        return "confirm";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public Date getDateOfBirthDate() {
        return dateOfBirthDate;
    }

    public void setDateOfBirthDate(Date dateOfBirthDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        this.dateOfBirthDate = dateOfBirthDate;
        this.dateOfBirth = sdf.format(dateOfBirthDate);
    }
}
