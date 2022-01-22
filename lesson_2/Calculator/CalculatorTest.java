import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner console = new Scanner(System.in);
        String check = "yes";
        while (!check.equals("no")) {
            if (check.equals("yes")) {
                System.out.print("Введите первое число: ");
                calculator.setNumber1(console.nextLong());
                System.out.print("Введите знак математической операции: ");
                calculator.setOperator(console.next().charAt(0));
                System.out.print("Введите второе число: ");
                calculator.setNumber2(console.nextLong());
                calculator.checkingOperator();
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            check = console.next();
        }
    }
}