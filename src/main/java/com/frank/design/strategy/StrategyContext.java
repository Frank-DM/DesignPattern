package com.frank.design.strategy;

/**
 * StrategyContext
 *
 * @AUTHOR:Frank
 * @DATE:08/02/2018
 */
public class StrategyContext {

    CashSuper cashSuper;

    public StrategyContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double getReceiveMoney(){
        return cashSuper.acceptCash();
    }
}
