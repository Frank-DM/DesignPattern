package com.frank.design.decorator.example;

/**
 * Decorator
 *
 * @AUTHOR:BSNPC1O
 * @DATE:08/03/2018
 */
public abstract class Finery extends Person {

    private Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if(person != null){
            person.show();
        }
    }
}
