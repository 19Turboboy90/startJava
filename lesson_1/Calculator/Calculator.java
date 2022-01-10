public class Calculator {
    public static void main(String[] args) {
        long number1 = 3;
        long number2 = 10;
        char operator = '^';

        if (operator == '+') {
            System.out.println(number1 + number2);
        } else if (operator == '-') {
            System.out.println(number1 - number2);
        } else if (operator == '*') {
            System.out.println(number1 * number2);
        } else if (operator == '/') {
            System.out.println(number1 / number2);
        } else if (operator == '%') {
            System.out.println(number1 % number2);
        } else if (operator == '^') {
            long tmp = number1;
            for (int i = 1; i < number2; i++) {
                number1 *= tmp;
            }
            System.out.println(number1);
        } else {
            System.out.println("entered an invalid operator");
        }
    }
}