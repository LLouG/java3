package dayTwentyEight;

import java.util.Scanner;

// Object as a method parameter

public class Oop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        /* String name = "";
        int age = 0;
        double weight = 0;
        double height = 0;

        while (Double.valueOf(height) == 0) {
            System.out.println("What's your name?");
            name = reader.nextLine();
            System.out.println("What's you age?");
            age = Integer.valueOf(reader.nextLine());
            System.out.println("What's your weight?");
            weight = Double.valueOf(reader.nextLine());
            System.out.println("What's your height?");
            height = Double.valueOf(reader.nextLine());
        }

        Person person = new Person(name, age, weight, height);
        System.out.println(person); */

        Person loug = new Person("Loug");
        System.out.println(loug);
        Person haejoon = loug;
        haejoon.growOlder(2);
        System.out.println(loug);
    }
}

class Person {
    private String name;
    private int age;
    private int weight;
    private double height;

    public Person(String name) {
        this(name, 0, 0, 0);
    }

    public Person(String name, int age, int weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return this.age;
    }

    public void growOlder(int getOlder) {
        this.age += getOlder;
    }
    
    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (this.height * this.height);
    }

    public String printBMI() {
        return this.name + "'s BMI: " + bodyMassIndex();
    }

    public String toString() {
        return this.name + "'s age: " + this.age;
    }
}