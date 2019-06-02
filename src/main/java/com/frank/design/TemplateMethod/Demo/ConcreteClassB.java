package com.frank.design.TemplateMethod.Demo;

/**
 * 子类：对于父类方法的不同实现
 * @AUTHOR:BSNPC1O
 * @DATE:05/23/2019
 */
public class ConcreteClassB extends AbstractClass{
    @Override
    public void primitiveOperation1() {
        System.out.println("This is ConcreteClassB's method : primitiveOperation1");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("This is ConcreteClassB's method : primitiveOperation2");
    }

    @Override
    protected void primitiveOperation3() {
        System.out.println("This is ConcreteClassB's method : primitiveOperation3");
    }


    @Override
    protected boolean primitiveOperation4() {
        return true;
    }
}
