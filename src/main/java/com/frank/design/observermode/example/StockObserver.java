package com.frank.design.observermode.example;


/**
 * 炒股观察者
 *
 * @AUTHOR:Frank
 * @DATE:05/31/2019
 */
public class StockObserver implements IObserver {

    //观察者名称
    private String stockObserverName;
    //通知者对象
    private Subject subject;
    public StockObserver(String observerName,Subject subject){
        this.stockObserverName = observerName;
        this.subject = subject;
    }
    //观察者信息更新
    @Override
    public void update(){
        System.out.println( String.format("%s 通知你：%s %s 关闭股票行情，继续工作。",subject.getSubjectName(),subject.getSubjectAction(),stockObserverName));
    }

}
