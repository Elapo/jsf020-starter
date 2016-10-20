package com.realdolmen.course.web.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Frederik Van Herbruggen on 20/10/2016.
 */
@ManagedBean
@SessionScoped
public class FinanceContainer {
    private List<FinancesObject> financeValues;

    @PostConstruct
    private void init(){
        financeValues = new ArrayList<FinancesObject>();
        financeValues.add(new FinancesObject("Java", 50.00));
        financeValues.add(new FinancesObject(".NET", 49.99));
        financeValues.add(new FinancesObject("Cool stuff", 40.00));
    }

    public List<FinancesObject> getFinanceValues() {
        return financeValues;
    }
}
