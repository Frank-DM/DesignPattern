package com.frank.design.proxy.example;

/**
 * @AUTHOR:BSNPC1O
 * @DATE:08/03/2018
 */
public class Client {

    public static void main(String[] args){
        Girl girl = new Girl("Lily");
        PersuitProxy persuitProxy = new PersuitProxy(girl);
        persuitProxy.giveChocolate();
        persuitProxy.giveDolls();
        persuitProxy.giveFlower();
    }
}
