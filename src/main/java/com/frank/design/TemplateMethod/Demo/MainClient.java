package com.frank.design.TemplateMethod.Demo;

/**
 * 测试客户端
 *
 * @AUTHOR:Frank
 * @DATE:05/23/2019
 */
public  class MainClient {

    public static void main(String[] args){
        AbstractClass superClass;

        superClass = new ConcreteClassA();
        superClass.tmplateMethod();

        superClass = new ConcreteClassB();
        superClass.tmplateMethod();


    }


}
