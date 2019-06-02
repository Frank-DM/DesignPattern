package com.frank.design.observermode.demo;

/**
 * 测试类
 * @AUTHOR:Frank
 * @DATE:08/24/2018
 */
public class MainClient {

    public static void main(String[] args){
        ConcrectSubject s = new ConcrectSubject();

        s.attach(new ConcrectObserver(s,"A"));
        s.attach(new ConcrectObserver(s,"B"));
        s.attach(new ConcrectObserver(s,"C"));

        s.setSubjectState("XYZ");

        s.notice();
    }
}
