package com.frank.design.buildermode.demo;

/**
 * @AUTHOR:Frank
 * @DATE:08/24/2018
 */
public class Director {

    public Product constructProdcut(Builder builder){
        builder.addPartA();
        builder.addPartB();
        Product result = builder.getResult();
        return result;
    }
}
