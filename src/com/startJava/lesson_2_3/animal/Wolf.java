package com.startJava.lesson_2_3.animal;

public class Wolf {

    private char gender;
    private String name;
    private double weight;
    private int age;
    private String color;

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (this.age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void go() {
        System.out.println("идет");
    }

    public void sit() {
        System.out.println("сидит");
    }

    public void run() {
        System.out.println("бежит");
    }

    public void speak() {
        System.out.println("воет");
    }

    public void hunting() {
        System.out.println("охотится");
    }
}