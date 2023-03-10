package com.example.java;

import java.util.Scanner;

import static com.example.java.util.MathMethods.*;

public class Calculator {

    public static void main(String[] args) {
        String string1 = getInput("Enter a numeric value: ");
        String string2 = getInput("Enter a numeric value: ");
        String option = getInput("Choose an operation (+ - * /):");

        double result;

        try {
            switch (option) {
                case "+":
                    result = addValues(string1, string2);
                    break;
                case "-":
                    result = subtractValues(string1, string2);
                    break;
                case "*":
                    result = multiplyValues(string1, string2);
                    break;
                case "/":
                    result = divideValues(string1, string2);
                    break;
                default:
                    System.out.println("Unrecognized operation!");
                    return;
            }

            System.out.println("The answer is " + result);

        } catch (Exception e) {
            System.out.println("Number formatting exception " + e.getMessage());
        }
    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}
