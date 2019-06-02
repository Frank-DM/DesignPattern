package com.frank.design.strategy;

/**
 * Cash normal
 *
 * @AUTHOR:BSNPC1O
 * @DATE:08/02/2018
 */
public class CashNormal extends  CashSuper{
    @Override
    public double acceptCash() {
        return super.getMoney();
    }
}
