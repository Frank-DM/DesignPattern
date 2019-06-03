package com.frank.design.facadepattern.demo;

/**
 * @AUTHOR:Frank
 * @DATE:08/20/2018
 */
public class Client {

    public static void main(String[] args){
        Facade facade = new Facade();
        facade.methodGroupA();
        System.out.println("method groupB ");
        facade.methodGroupB();
    }
}
