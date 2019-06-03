package com.frank.design.buildermode.demo;

import com.frank.design.prototype.demo.ConcretePrototype1;

import javax.print.attribute.standard.MediaSizeName;

/**
 * @AUTHOR:Frank
 * @DATE:08/24/2018
 */
public class Client {
    public static void main(String[] args){
        Builder builder1 = new ConcrectBuilderB();
        Director director = new Director();
        Product resultProduct = director.constructProdcut(builder1);
        resultProduct.show();
    }
}
