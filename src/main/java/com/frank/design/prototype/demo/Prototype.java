package com.frank.design.prototype.demo;

/**
 * @AUTHOR:bsnpc1o
 * @DATE:08/17/2018
 */
public abstract class Prototype {

    private String id;

    public Prototype(String id){
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public abstract  Prototype selfClone();
}
