package com.frank.design.simplefactory;

/**
 * Operation Factory
 *
 * @AUTHOR:Frank
 * @DATE:08/02/2018
 */
public class OperationFactory {


    public static CalOperation getOperation(String operation){

        CalOperation operation1= null;
         switch(operation){
             case "+":
                 operation1= new AddOperation();
                 break;
         }

         return operation1;
    }

}
