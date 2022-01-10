public class Unicode {
    public static void main(String[] args) {
        char startRange = 33;
        char endRange = 126;
        for (char ch = startRange; ch <= endRange; ch++) {
            System.out.print(ch + " ");
        }
    }
}