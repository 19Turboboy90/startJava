package com.startJava.lesson_2_3_4.calculator;

public class Calculator {
    public int calculate(String mathExpression) {
        String[] arrayMath = mathExpression.split(" ");
        int number1 = Integer.parseInt(arrayMath[0]);
        char operator = arrayMath[1].charAt(0);
        int number2 = Integer.parseInt(arrayMath[2]);
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
