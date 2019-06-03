package com.frank.design.buildermode.demo;

/**
 * @AUTHOR:Frank
 * @DATE:08/24/2018
 */
public class ConcrectBuilder extends Builder {

    private Product product = new Product();

    @Override
    public void addPartA() {
        product.addPart("partA from ConcrectBuilder");
    }

    @Override
    public void addPartB() {
        product.addPart("partB from ConcrectBuilder");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
