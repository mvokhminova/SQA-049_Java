package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        while (!"q".equals(userInput)) {
           try {
               System.out.println("Enter expression:");
               double result;
               String opreation="";
               int firstNumber=0;
               int secondNumber=1;
               userInput = scanner.nextLine().replaceAll(" ", "");
               if (!"q".equals(userInput)) {

                   String[] expr = userInput.split("\\s*|(\\+|\\-|\\*|\\/)");
                   if(expr.length<=1 || expr.length>3){throw new InputMismatchException(); }
                   firstNumber = Integer.parseInt(expr[0]);
                   opreation = expr[1];
                   if(expr.length==3) {
                       secondNumber = Integer.parseInt(expr[2]);
                   }

                   switch (opreation) {
                       case "+":
                           result = plus(firstNumber, secondNumber);
                           break;
                       case "-":
                           result = minus(firstNumber, secondNumber);
                           break;
                       case "*":
                           result = ymn(firstNumber, secondNumber);
                           break;
                       case "/":
                           if (secondNumber == 0) {
                               System.out.println("Divide to zero is forbidden!");
                               continue;
                           }
                           result = del(firstNumber, secondNumber);
                           break;
                       case "!":
                           result = fact(firstNumber);
                           break;
                       default:
                           result = 0;
                           break;
                   }
               } else {
                   break;
               }
               System.out.println(result);
           }
           catch (InputMismatchException ex){
               System.out.println("Wrong input data!");
               continue;
           }
        }
        scanner.close();
    }

    private static int plus(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }
    private static int minus(int numberOne, int numberTwo){
        return numberOne - numberTwo;
    }

    private static int ymn(int numberOne, int numberTwo){
        return numberOne * numberTwo;
    }

    private static double del(int numberOne, int numberTwo){
        return (double) numberOne / numberTwo;
    }
    private static int fact(int numberOne){
        int res = 1;
        for (int i = 1; i <= numberOne; i++) {
            res *= i;
        }

        return res;
    }
}
