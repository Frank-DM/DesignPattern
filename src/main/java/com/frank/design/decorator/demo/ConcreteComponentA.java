package com.frank.design.decorator.demo;

/**
 * @AUTHOR:Frank
 * @DATE:08/03/2018
 */
public class ConcreteComponentA extends Decorator {

    private String addStateA;

    @Override
    public void operation() {
        super.component.operation();
        addStateA= "Add a state ";
    }
}
