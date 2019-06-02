package com.frank.design.proxy.demo;

/**
 * Real Subject to Request
 *
 * @AUTHOR:BSNPC1O
 * @DATE:08/03/2018
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("Real Request");
    }
}
