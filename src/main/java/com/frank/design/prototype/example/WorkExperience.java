package com.frank.design.prototype.example;

import java.io.Serializable;

/**
 * @AUTHOR:bsnpc1o
 * @DATE:08/17/2018
 */
public class WorkExperience implements Serializable {
    private static final long serialVersionUID = 2631590509760908280L;

    private String timeArea;
    private String company;

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


}
