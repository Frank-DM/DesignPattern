package com.frank.design.facade.demo;

/**
 * @AUTHOR:bsnpc1o
 * @DATE:08/20/2018
 */
public class Facade {
    private SubSystemClassFirst subSystemClassFirst;
    private SubSystemClassSecond  subSystemClassSecond;
    private SubSystemClassThird subSystemClassThird;

    public Facade() {
        this.subSystemClassFirst = new SubSystemClassFirst();
        this.subSystemClassSecond = new SubSystemClassSecond();
        this.subSystemClassThird = new SubSystemClassThird();
    }

    public void methodGroupA(){
        subSystemClassFirst.methodOne();
        subSystemClassThird.methodOne();
    }
    public void methodGroupB(){
        subSystemClassSecond.methodOne();
        subSystemClassThird.methodOne();
    }
}
