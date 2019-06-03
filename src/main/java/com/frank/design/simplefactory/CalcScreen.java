package com.frank.design.simplefactory;

import java.util.Scanner;

/**
 * Calculate screen to result
 *
 * @AUTHOR:Frank
 * @DATE:08/02/2018
 */
public class CalcScreen {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input the first number?");
        double firstNum = scanner.nextDouble();
        System.out.print("input the secondNum number?");
        double secondNum = scanner.nextDouble();

        CalOperation calOperation =  OperationFactory.getOperation("+");
        calOperation.setFirstNum(firstNum);
        calOperation.setSeconNum(secondNum);
        double result = calOperation.getResult();

        System.out.print(result);
    }
}
