package com.frank.design.decorator.demo;

/**
 * @AUTHOR:Frank
 * @DATE:08/03/2018
 */
public class ConcreteComponentB extends  Decorator{

    private String addStateB;
    @Override
    public void operation() {
        super.component.operation();
        addStateB = "Add new state B";
    }
}
