public class Variable {
    public static void main(String[] args) {
        byte core = 6;
        short ramMemory = 16;
        int systemBitDepth = 64;
        long ssd  = 300000L;
        float processorFrequency = 4.3f;
        double hardDiskMemory = 375782.274;
        char motherboard = 'm';
        boolean cooler = true;

        System.out.println("byte: " + core);
        System.out.println("short: " + ramMemory);
        System.out.println("int: " + systemBitDepth);
        System.out.println("long: " + ssd);
        System.out.println("float: " + processorFrequency);
        System.out.println("double: " + hardDiskMemory);
        System.out.println("char: " + motherboard);
        System.out.println("boolean: " + cooler);
    }
}