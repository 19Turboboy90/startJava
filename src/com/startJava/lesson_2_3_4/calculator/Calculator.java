package com.startJava.lesson_2_3_4.calculator;

public class Calculator {
    public int calculate(int number1, int number2, char operator) {
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
            default:  System.out.println("Введен неверный математический оператор");
        }
        return -1;
    }
}
