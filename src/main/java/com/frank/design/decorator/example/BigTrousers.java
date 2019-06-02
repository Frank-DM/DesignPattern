package com.frank.design.decorator.example;

/**
 * Concrete Decorator
 * @AUTHOR:BSNPC1O
 * @DATE:08/03/2018
 */
public class BigTrousers extends Finery {

    @Override
    public void show() {
        super.show();
        System.out.println("Big Trousers");
    }
}
