package com.frank.design.strategy;

/**
 * Stategy discount
 *
 * @AUTHOR:BSNPC1O
 * @DATE:08/02/2018
 */
public class CashDiscount extends  CashSuper {

    private double discount;
    @Override
    public double acceptCash() {
        return super.getMoney()*discount;
    }
}
