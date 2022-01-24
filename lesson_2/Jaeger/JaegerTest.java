public class JaegerTest {
    public static void main(String[] args) {
        Jaeger romeoBlue = new Jaeger();
        romeoBlue.setModelName("Romeo Blue");
        romeoBlue.setMark("Mark-1");
        romeoBlue.setOrigin("USA");
        romeoBlue.setHeight(77.72f);
        romeoBlue.setWeight(7775);
        romeoBlue.setSpeed(2);
        romeoBlue.setStrength(7);
        romeoBlue.setArmor(6);

        Jaeger louisBancroft = new Jaeger();
        louisBancroft.setModelName("Louis Bancroft");
        louisBancroft.setMark("Mark-1");
        louisBancroft.setOrigin("Canada");
        louisBancroft.setHeight(79);
        louisBancroft.setWeight(2980);
        louisBancroft.setSpeed(10);
        louisBancroft.setStrength(10);
        louisBancroft.setArmor(10);

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