public class Unicode {
    public static void main(String[] args) {
        char firstPosition = 33;
        char lastPosition = 126;
        for (char ch = firstPosition; ch <= lastPosition; ch++) {
            System.out.print(ch + " ");
        }
    }
}