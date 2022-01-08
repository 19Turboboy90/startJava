public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 31;
        double height = 1.73;
        boolean ManGender = true;
        char name = 'I';

        if (age > 20) {
            System.out.println("Age is more than average");
        }

        if (ManGender) {
            System.out.println("Man");
        }

        if (!ManGender) {
            System.out.println("Woman");
        }

        if (height < 1.80) {
            System.out.println("A man of average height");
        } else {
            System.out.println("Tall man");
        }

        if (name == 'M') {
            System.out.println("Name Max");
        } else if (name == 'I') {
            System.out.println("Name Ilia");
        } else {
            System.out.println("Other name");
        }
    }
}