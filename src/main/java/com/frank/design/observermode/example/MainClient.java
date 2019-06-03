package com.frank.design.observermode.example;

/**
 * 客户端测试类
 *
 * @AUTHOR:Frank
 * @DATE:05/31/2019
 */
public class MainClient {

    public static void main(String[] args) {
        // 秘书通知者对象
        Subject secretary = new Secretary("secretary Lily");

        // 老板通知这对象
        Subject boss = new Boss("boss Jack");

        //观察者对象
        IObserver susan = new StockObserver("Susan", secretary);
        IObserver alice = new NBAObserver("Alice", secretary);

        // 将观察这加入到通知者对象集合中
        secretary.attach(susan);
        secretary.attach(alice);

        // 更新通知者行为
        secretary.setSubjectAction("老板回来了");

        // 通知被观察者
        secretary.notifyInfo();

        boss.attach(new NBAObserver("Lucy",boss));
       boss.setSubjectAction("我回来了");
        boss.notifyInfo();

    }
}
