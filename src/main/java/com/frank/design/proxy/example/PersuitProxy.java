package com.frank.design.proxy.example;

/**
 * @AUTHOR:Frank
 * @DATE:08/03/2018
 */
public class PersuitProxy implements GiveGift {

    private Persuit persuit;

    public PersuitProxy(Girl girl) {
        if (persuit == null) {
            persuit = new Persuit(girl);
        }
    }

    public void giveFlower() {
        persuit.giveFlower();
    }

    public void giveChocolate() {
        persuit.giveChocolate();
    }

    public void giveDolls() {
        persuit.giveDolls();
    }
}
