package com.frank.design.strategy;

/**
 * CashReturn
 *
 * @AUTHOR:Frank
 * @DATE:08/02/2018
 */
public class CashReturn extends  CashSuper{

    private double returnCondition;
    private double returnMoney;

    @Override
    public double acceptCash() {
        if(super.getMoney()<returnCondition){
            return super.getMoney();
        }
        return (super.getMoney()/returnCondition)*returnMoney;
    }
}
