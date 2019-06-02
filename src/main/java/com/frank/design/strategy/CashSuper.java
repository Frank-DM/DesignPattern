package com.frank.design.strategy;

/**
 * Caseh Super
 *
 * @AUTHOR:BSNPC1O
 * @DATE:08/02/2018
 */
public abstract class CashSuper {

    private double money;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public abstract double acceptCash();
}
