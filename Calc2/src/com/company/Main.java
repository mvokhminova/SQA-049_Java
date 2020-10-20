package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        while (!"q".equals(userInput)) {
            System.out.println("Enter number one:");
            int firstNumber = scanner.nextInt();
            System.out.println("Enter number two:");
            int secondNumber = scanner.nextInt();
            System.out.println("Enter operation:");
            userInput = scanner.next();

            double result;

            switch (userInput){
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
                    if(secondNumber == 0){
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
            System.out.println(result);
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

    private static int del(int numberOne, int numberTwo){
        return numberOne / numberTwo;
    }
    private static int fact(int numberOne){
        int res = 1;
        for (int i = 1; i <= numberOne; i++) {
            res *= i;
        }

        return res;
    }
}
