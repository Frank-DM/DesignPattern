package com.frank.design.prototype.demo;

/**
 * @AUTHOR:Frank
 * @DATE:08/17/2018
 */
public class PrototypeMain {

    public static void main(String[] args) {
        ConcretePrototype1 prototype1 = new ConcretePrototype1("Frank");
        Prototype clone = prototype1.selfClone();
        System.out.println("Clone result :"+clone.getId());
    }
}
