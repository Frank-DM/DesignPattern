package com.frank.design.observermode.demo;

/**
 * 观察者实现类
 * @AUTHOR:Frank
 * @DATE:08/24/2018
 */
public class ConcrectObserver extends Observer {

    private String name;
    private String observerState;
    private ConcrectSubject subject;


    public  ConcrectObserver(ConcrectSubject subject,String name){
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println("observer name :"+name+ "state :"+observerState);
    }
}
