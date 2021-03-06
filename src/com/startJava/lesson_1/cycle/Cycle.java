package com.startJava.lesson_1.cycle;

public class Cycle {
    public static void main(String[] args) {
        //Cycle for  
        for(int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }

        //Cycle while
        int number1 = -6;
        while (number1 <= 6) {
            System.out.print(number1 + " ");
            number1 += 2;
        }

        // do while
        int number2 = 10;
        int sumOdd = 0;
        do {
            if (number2 % 2 == 1) {
                sumOdd += number2;
            }
            number2++;
        } while(number2 < 20);
        System.out.println("sum of numbers: " + sumOdd);
    }
}