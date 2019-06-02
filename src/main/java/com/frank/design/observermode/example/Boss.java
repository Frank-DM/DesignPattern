package com.frank.design.observermode.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 通知者：Boss类
 *
 * @AUTHOR:BSNPC1O
 * @DATE:05/31/2019
 */
public class Boss implements Subject {

    private List<IObserver> observers =  new ArrayList<IObserver>();

    private String  bossAction;

    private String  bossName;

    public Boss(String subjectName){
        this.bossName = subjectName;
    }
    //添加观察者
    @Override
    public void attach(IObserver observer){
        observers.add(observer);
    }

    //移除观察者
    @Override
    public void detach(IObserver observer){
        observers.remove(observer);
    }

    //通知观察者
    @Override
    public void notifyInfo(){
        for (IObserver observer:observers) {
            observer.update();
        }
    }

    @Override
    public String getSubjectAction() {
        return this.bossAction;
    }

    @Override
    public void setSubjectAction(String subjectAction) {
        this.bossAction = subjectAction;
    }

    @Override
    public String getSubjectName() {
        return bossName;
    }

    @Override
    public void setSubjectName(String subjectName) {
        this.bossName = subjectName;
    }
}
