package com.frank.design.observermode.example;

/**
 * 通知者抽象接口
 */
public interface Subject {


    //增加观察者
    public void attach(IObserver observer);

    //移除观察者
    public void detach(IObserver observer);

    //通知被观察者
    public void notifyInfo();

    public String  getSubjectAction();

    public void setSubjectAction(String subjectAction);

    public String getSubjectName();

    public void setSubjectName(String subjectName);
}
