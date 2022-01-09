public class MyFirstGame {
    public static void main(String[] args) {
        int guessNumber = 55;
        int enteredNumber = 30;
        boolean isWin = false;

        while(!isWin) {
            if (guessNumber < enteredNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
                enteredNumber -= 5;
            } else if (guessNumber > enteredNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                enteredNumber += 4;
            } else {
                System.out.println("Поздравляю, число угадано!");
                isWin = true;
            }
        }
    }
}