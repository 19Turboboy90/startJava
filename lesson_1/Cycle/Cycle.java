public class Cycle {
    public static void main(String[] args) {
      //Cycle for  
        for(int i = 0; i <= 20; i++) {
            if (i == 20) {
                System.out.println(i + ".");
            } else {
                System.out.print(i + ", ");
            }  
        }

      //Cycle while
        int value = -6;
        while (value <= 6) {
            if (value == 6) {
                System.out.println(value + ".");
            } else {
                System.out.print(value + ", ");
            }
            value +=2;
        }

      // do while
        int number = 10;
        int tmp = 0;
        do {
            if (number % 2 == 1) {
                tmp += number;
            }
            number++;
        } while(number < 20);
        System.out.println("sum of numbers: " + tmp);
    }
}