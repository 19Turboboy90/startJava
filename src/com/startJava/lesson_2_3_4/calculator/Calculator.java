package com.startJava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {
    public int calculate() {
        int number1;
        int number2;
        char operator;
        Scanner console = new Scanner(System.in);
        System.out.print("Введите математическое выражение: ");
        String mathExpression = console.nextLine();
        String[] arrayMath = mathExpression.split(" ");
        number1 = Integer.parseInt(arrayMath[0]);
        operator = arrayMath[1].charAt(0);
        number2 = Integer.parseInt(arrayMath[2]);
        switch (operator) {
            case '+':
                return Math.addExact(number1, number2);
            case '-':
                return Math.subtractExact(number1, number2);
            case '*':
                return Math.multiplyExact(number1, number2);
            case '/':
                return number1 / number2;
            case '%':
                return (int) Math.IEEEremainder(number1, number2);
            case '^':
                return (int) Math.pow(number1, number2);
            default:
                System.out.println("Введен неверный математический оператор");
        }
        return -1;
    }
}
