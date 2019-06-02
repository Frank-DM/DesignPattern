package com.frank.design.simplefactory;

/**
 * Add operation
 *
 * @AUTHOR:BSNPC1O
 * @DATE:08/02/2018
 */
public class AddOperation extends  CalOperation {


    @Override
    public double getResult() {

        return super.getFirstNum()+super.getSeconNum();
    }
}
