package com.frank.design.TemplateMethod.Demo;

/**
 *  模板方法模式父类，用于定义所有不变的行为，从而去除子类重复代码，提高代码复用性。
 * @AUTHOR:Frank
 * @DATE:05/23/2019
 */
public abstract class AbstractClass {


    //protected 修饰抽象方法是为了该方法不对外开发，只针对与实现类开放
    protected abstract void primitiveOperation1();
    protected abstract void primitiveOperation2();

    protected abstract void primitiveOperation3();

    // 条件判断方法，判断某个方法是否可以执行
    protected  boolean  primitiveOperation4(){
        return false;
    }


    protected final void primitiveOperation5(){
        System.out.println("can't change method:primitiveOperation5");
    }
    //final 修饰是保证整体调用方法不被改动，保证逻辑的不可变性
    public final void tmplateMethod(){
        System.out.println("whole method start");
        primitiveOperation1();
        primitiveOperation2();
        if(primitiveOperation4()){
            primitiveOperation3();
        }
        primitiveOperation5();
        System.out.println("whole method end");
    }

}


