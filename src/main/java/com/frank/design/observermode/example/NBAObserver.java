package com.frank.design.observermode.example;

/**
 * NBA观察者
 * @AUTHOR:Frank
 * @DATE:05/31/2019
 */
public class NBAObserver implements IObserver {


    //观察者名称
    private String nbaObserverName;
    //通知者对象
    private Subject subject;
    public NBAObserver(String observerName,Subject subject){
        this.nbaObserverName = observerName;
        this.subject = subject;
    }


    //观察者信息更新
    @Override
    public void update() {
        System.out.println( String.format("%s 通知你：%s %s 关闭NBA直播，继续工作。",subject.getSubjectName(),subject.getSubjectAction(),nbaObserverName));
    }
}
