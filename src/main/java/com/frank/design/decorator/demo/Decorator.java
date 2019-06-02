package com.frank.design.decorator.demo;

/**
 * Abstarct decorator class
 *
 * @AUTHOR:BSNPC1O
 * @DATE:08/03/2018
 */
public abstract class Decorator extends  DecoratorComponent{


    protected  DecoratorComponent  component;

    public void setComponent(DecoratorComponent component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if(component != null){
            component.operation();
        }
    }

}
