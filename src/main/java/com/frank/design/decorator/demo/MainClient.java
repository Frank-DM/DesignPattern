package com.frank.design.decorator.demo;

/**
 * @AUTHOR:Frank
 * @DATE:08/03/2018
 */
public class MainClient {

    public static void main(String[] args){

        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteComponentA concreteComponentA = new ConcreteComponentA();
        ConcreteComponentB concreteComponentB = new ConcreteComponentB();

        concreteComponentA.setComponent(concreteComponent);
        concreteComponentA.operation();
        concreteComponentB.setComponent(concreteComponentA);
        concreteComponentB.operation();


    }
}
