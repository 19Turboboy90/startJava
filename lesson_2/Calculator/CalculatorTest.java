import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner console = new Scanner(System.in);
        boolean isReplay = false;
        while (!isReplay) {
            System.out.print("Введите первое число: ");
            calculator.setNumber1(console.nextLong());
            System.out.print("Введите знак математической операции: ");
            calculator.setOperator(console.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setNumber2(console.nextLong());
            calculator.asd();
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            String amv = console.next();
            while (!amv.equals("no") && !amv.equals("yes")) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                amv = console.next();
                isReplay = false;
            }
            if (amv.equals("no")) {
                isReplay = true;
            }
        }
    }
}