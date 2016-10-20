package com.realdolmen.course.web.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by Frederik Van Herbruggen on 20/10/2016.
 */
public class FinancesBean {
    private String department;
    private double money;

    public FinancesBean(String dep, double money){
        this.department = dep;
        this.money = money;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
