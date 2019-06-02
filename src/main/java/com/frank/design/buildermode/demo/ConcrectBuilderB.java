package com.frank.design.buildermode.demo;

/**
 * @AUTHOR:bsnpc1o
 * @DATE:08/24/2018
 */
public class ConcrectBuilderB extends Builder {

    private Product product = new Product();

    @Override
    public void addPartA() {
        product.addPart("partA from ConcrectBuilderB");
    }

    @Override
    public void addPartB() {
        product.addPart("partB from ConcrectBuilderB");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
