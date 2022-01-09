public class Variable {
    public static void main(String[] args) {
        byte core = 6;
        short ramMemory = 16;
        int systemBitDepth = 64;
        long ssd = 300000L;
        float processorFrequency = 4.3f;
        double hardDiskMemory = 375782.274;
        char motherboard = 'm';
        boolean cooler = true;

        System.out.println("колличество ядер: " + core);
        System.out.println("оперативная память: " + ramMemory);
        System.out.println("разрядность системы: " + systemBitDepth);
        System.out.println("ssd диск: " + ssd);
        System.out.println("частота процессора: " + processorFrequency);
        System.out.println("жесткий диск: " + hardDiskMemory);
        System.out.println("материнская плата: " + motherboard);
        System.out.println("кулер: " + cooler);
    }
}