package com.frank.design.decorator.example;

import com.frank.design.decorator.demo.Decorator;

/**
 * Concrete Decorator
 * @AUTHOR:Frank
 * @DATE:08/03/2018
 */
public class TShirts extends Finery {
    @Override
    public void show() {
        super.show();
        System.out.println("Big TShirt");
    }
}
