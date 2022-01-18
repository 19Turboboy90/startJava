public class WolfTest {
    public static void main(String[] agrs) {
        Wolf wolf = new Wolf();
        wolf.name = "Grand";
        wolf.gender = 'm';
        wolf.weight = 26.5;
        wolf.age = 3;
        wolf.color = "grey";

        System.out.println("имя: " + wolf.name);
        System.out.println("пол: " + wolf.gender);
        System.out.println("вес: " + wolf.weight);
        System.out.println("возраст: " + wolf.age);
        System.out.println("окрас: " + wolf.color);

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.speak();
        wolf.hunting();
    }
}