public class GuessNumber {
    int guessNumber = (int) (Math.random() * 100);

    public void guess(Player player) {
        if (guessNumber > player.getNumber()) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else if (guessNumber < player.getNumber()) {
            System.out.println("Данное число больше того, что загадал компьютер");
        }
    }

    public void newGuess() {
        guessNumber = (int) (Math.random() * 100);
    }
}