package com.frank.design.factorymethod.demo;

/**
 * @AUTHOR:Frank
 * @DATE:08/03/2018
 */
public class SubstractionOperation extends CalOperation {
    @Override
    public double getResult() {
        return super.getFirstNum()-super.getSeconNum();
    }
}
