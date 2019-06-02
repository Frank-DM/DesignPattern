package com.frank.design.proxy.example;

/**
 * Real Peruit:Real Subject
 *
 * @AUTHOR:BSNPC1O
 * @DATE:08/03/2018
 */
public class Persuit implements GiveGift {


    private Girl girl;

    public Persuit(){

    }
    public Persuit( Girl girl) {
        this.girl=girl;
    }

    @Override
    public void giveFlower() {
        System.out.println("Give flowers to "+girl.getGirlName());
    }

    @Override
    public void giveChocolate() {
        System.out.println("Give chocolate to "+girl.getGirlName());
    }

    @Override
    public void giveDolls() {
        System.out.println("Give dolls to "+girl.getGirlName());
    }
}
