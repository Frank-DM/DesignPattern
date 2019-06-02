package com.frank.design.buildermode.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @AUTHOR:bsnpc1o
 * @DATE:08/24/2018
 */
public class Product {
   private List<String> productPart = new ArrayList<String>();

   public void addPart(String part){
       productPart.add(part);
   }

   public void show(){
       System.out.println("Product create");
       for (String part :productPart) {
           System.out.println(part);
       }
   }

}
