package com.frank.design.observermode.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 通知者抽象类
 * @AUTHOR:Frank
 * @DATE:08/24/2018
 */
public abstract class Subject {

    private List<Observer> observers =new ArrayList<Observer>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notice(){
        for (Observer obser : observers) {
            obser.update();
        }
    }

}
