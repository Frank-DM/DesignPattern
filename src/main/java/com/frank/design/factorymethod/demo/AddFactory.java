package com.frank.design.factorymethod.demo;

/**
 * @AUTHOR:Frank
 * @DATE:08/03/2018
 */
public class AddFactory implements IFactory {
    @Override
    public CalOperation operation() {
        return  new AddOperation();
    }


}
