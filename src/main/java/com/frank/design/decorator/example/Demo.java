package com.frank.design.decorator.example;

/**
 * @AUTHOR:BSNPC1O
 * @DATE:08/03/2018
 */
public class Demo {
   public static void main(String[] args){
       Person frankPerson = new Person("Frank");
       TShirts tShirts = new TShirts();
       BigTrousers bigTrousers = new BigTrousers();
       tShirts.setPerson(frankPerson);
       bigTrousers.setPerson(tShirts);
       bigTrousers.show();
   }
}
