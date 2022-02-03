package com.startJava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner console = new Scanner(System.in);
        String option = "yes";
        while (!option.equals("no")) {
            if (option.equals("yes")) {
                System.out.println(calculator.calculate());
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            option = console.nextLine();
        }
    }
}