public class MyFirstGame {
    public static void main(String[] args) {
        int guessNumber = 55;
        int enteredNumber = 30;

        while(enteredNumber != guessNumber) {
            if (guessNumber < enteredNumber) {
                System.out.println("������ ����� ������ ����, ��� ������� ���������");
                enteredNumber -= 5;
            } else if (guessNumber > enteredNumber) {
                System.out.println("������ ����� ������ ����, ��� ������� ���������");
                enteredNumber += 4;
            }
        }
        System.out.println("����������, ����� �������!");
    }
}