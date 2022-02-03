package com.startJava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner console = new Scanner(System.in);
        String checkingResponse = "yes";
        while (!checkingResponse.equals("no")) {
            if (checkingResponse.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                String mathExpression = console.nextLine();
                String[] arrayMath = mathExpression.split(" ");
                int number1 = Integer.parseInt(arrayMath[0]);
                char operator = arrayMath[1].charAt(0);
                int number2 = Integer.parseInt(arrayMath[2]);
                System.out.println(calculator.calculate(number1, number2, operator));
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            checkingResponse = console.nextLine();
        }
    }
}