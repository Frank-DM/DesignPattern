package com.frank.design.proxy.example;

/**
 * @AUTHOR:BSNPC1O
 * @DATE:08/03/2018
 */
public class PersuitProxy implements GiveGift {

    private Persuit persuit;

    public PersuitProxy(Girl girl) {
        if (persuit == null) {
            persuit = new Persuit(girl);
        }
    }

    @Override
    public void giveFlower() {
        persuit.giveFlower();
    }

    @Override
    public void giveChocolate() {
        persuit.giveChocolate();
    }

    @Override
    public void giveDolls() {
        persuit.giveDolls();
    }
}
