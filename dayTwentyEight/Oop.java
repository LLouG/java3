package dayTwentyEight;

import java.util.Scanner;

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
        System.out.println(loug.printPerson());
    }
}

class Person {
    private String name;
    private int age;
    private double weight;
    private double height;

    public Person(String name) {
        this(name, 0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String printPerson() {
        return this.name + " is " + this.age + " years old.";
    }

    public double bodyMassIndex() {
        return this.weight / (this.height * this.height);
    }

    public double maximumHeartRate() {
        return 206.3 - (0.711 * this.age);
    }

    public String toString() {
        return this.name + ", BMI: " + this.bodyMassIndex() + ", maximum heart rate: " + this.maximumHeartRate();
    }
}