package com.frank.design.factorymethod.demo;

/**
 * @AUTHOR:BSNPC1O
 * @DATE:08/03/2018
 */
public class SubstractionFactory implements IFactory {
    @Override
    public CalOperation operation() {
        return new SubstractionOperation();
    }
}
