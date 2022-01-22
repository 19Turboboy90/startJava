import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        GuessNumber guessNumber = new GuessNumber();
        Scanner console = new Scanner(System.in);
        String check = "yes";
        System.out.print("Введите имя первого игрока: ");
        String name1 = console.nextLine();
        Player player1 = new Player(name1, 0);
        System.out.print("Введите имя второго игрока: ");
        String name2 = console.nextLine();
        Player player2 = new Player(name2, 0);
        while (!check.equals("no")) {
            if (check.equals("yes")) {
                while (guessNumber.guessNumber != player1.getNumber() || guessNumber.guessNumber != player2.getNumber()) {
                    System.out.print("Игрок " + player1.getName() + " вводит число: ");
                    player1.setNumber(console.nextInt());
                    guessNumber.guess(player1);
                    if (player1.getNumber() == guessNumber.guessNumber) {
                        System.out.println("Тгрок: " + player1.getName() + " победил!!! Угадав число " + guessNumber.guessNumber);
                        break;
                    }
                    System.out.print("Игрок " + player2.getName() + " вводит число: ");
                    player2.setNumber(console.nextInt());
                    guessNumber.guess(player2);
                    if (player2.getNumber() == guessNumber.guessNumber) {
                        System.out.println("Игрок: " + player2.getName() + " победил!!! Угадав число " + guessNumber.guessNumber);
                        break;
                    }
                }
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            check = console.next();
            guessNumber.newGuess();
        }
    }
}