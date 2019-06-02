package com.frank.design.factorymethod.demo;

public abstract class CalOperation {

    private double firstNum;
    private double seconNum;



    public abstract double getResult();




    public double getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public double getSeconNum() {
        return seconNum;
    }

    public void setSeconNum(double seconNum) {
        this.seconNum = seconNum;
    }
}
