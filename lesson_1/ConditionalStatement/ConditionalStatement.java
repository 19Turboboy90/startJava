public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 31;
        if (age > 20) {
            System.out.println("Age is more than average");
        }

        boolean manGender = true;
        if (manGender) {
            System.out.println("Man");
        }
        if (!manGender) {
            System.out.println("Woman");
        }

        double height = 1.73;
        if (height < 1.80) {
            System.out.println("A man of average height");
        } else {
            System.out.println("Tall man");
        }

        char firstLetterOfName = 'I';
        if (firstLetterOfName == 'M') {
            System.out.println("Name Max");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Name Ilia");
        } else{
            System.out.println("Other name");
        }
    }
}