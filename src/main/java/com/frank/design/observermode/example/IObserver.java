package com.frank.design.observermode.example;

/**
 * 观察接口
 * 为什么不用抽象类呢：
 * 因为在实际开发工作中，我们完全不知道都会有什么样的观察者类。
 * @AUTHOR:BSNPC1O
 * @DATE:05/31/2019
 */
public interface IObserver {

    // 观察者状态改变
    public abstract void update();
}
