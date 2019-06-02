package com.frank.design.prototype.demo;

/**
 * @AUTHOR:bsnpc1o
 * @DATE:08/17/2018
 */
public class ConcretePrototype1 extends  Prototype {



    public ConcretePrototype1(String id) {
        super(id);
    }


    public Prototype selfClone() {
        ConcretePrototype1 prototype1 = new ConcretePrototype1(super.getId());
        return prototype1;
    }
}
