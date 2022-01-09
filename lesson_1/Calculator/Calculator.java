public class Calculator {
    public static void main(String[] args) {
        int number1 = 17;
        int number2 = 5;
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
            System.out.println(number1 * number1);
        } else {
            System.out.println("entered an invalid operator");
        }
    }
}