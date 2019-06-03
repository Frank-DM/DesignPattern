package com.frank.design.observermode.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 通知者秘书类
 *
 * @AUTHOR:Frank
 * @DATE:05/31/2019
 */
public class Secretary implements Subject{
    //观察者集合
   private  List<IObserver> observers =  new ArrayList<IObserver>();

   private String secretaryAction;
   private String secretaryName;

    public Secretary(String subjectName){
        this.secretaryName = subjectName;
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
        return this.secretaryAction;
    }

    @Override
    public void setSubjectAction(String subjectAction) {
        this.secretaryAction = subjectAction;
    }


    @Override
    public String getSubjectName() {
        return secretaryName;
    }
    @Override
    public void setSubjectName(String subjectName) {
        this.secretaryName = subjectName;
    }
}
