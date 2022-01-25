public class JaegerTest {
    public static void main(String[] args) {
        Jaeger romeoBlue = new Jaeger("Romeo Blue","Mark-1","USA",77.72f,7775,2,7,6);
        Jaeger louisBancroft = new Jaeger("Louis Bancroft","Mark-1","Canada",79,2980,10,10,10);

        System.out.println(louisBancroft.getModelName() + " Вышел на охоту");
        louisBancroft.scanningTerrain("Производится сканирование месности");
        System.out.println(louisBancroft.getModelName());
        louisBancroft.shoot();
        System.out.println(romeoBlue.getModelName());
        romeoBlue.move();
        System.out.println(romeoBlue.getModelName());
        romeoBlue.shoot();
        System.out.println(louisBancroft.getModelName());
        louisBancroft.shield();
        System.out.println(louisBancroft.getModelName());
        romeoBlue.shoot();
        System.out.println(romeoBlue.getModelName() + " Побежден!!!");
    }
}