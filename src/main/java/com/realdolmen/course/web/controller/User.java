package com.realdolmen.course.web.controller;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Frederik Van Herbruggen on 21/10/2016.
 */
public class User {

    @NotBlank(message = "Required field")
    private String firstName = "Frederik",
            lastName = "Van Herbruggen",
            dateOfBirth = "26/10/2016",
            gender = "male",
            serviceLevel = "High";

    @Email(message = "Not a valid email address")
    private String email = "frederik.vanherbruggen@realdolmen.com";

    @Past(message = "Oh, hey there, Doctor!")
    private Date dateOfBirthDate = new Date();

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
