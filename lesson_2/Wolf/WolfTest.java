public class WolfTest {
    public static void main(String[] agrs) {
        Wolf wolf = new Wolf();
        wolf.setName("Grand");
        wolf.setGender('m');
        wolf.setWeight(26.5);
        wolf.setAge(3);
        wolf.setColor("grey");

        System.out.println("имя: " + wolf.getName());
        System.out.println("пол: " + wolf.getGender());
        System.out.println("вес: " + wolf.getWeight());
        System.out.println("возраст: " + wolf.getAge());
        System.out.println("окрас: " + wolf.getColor());

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.speak();
        wolf.hunting();
    }
}