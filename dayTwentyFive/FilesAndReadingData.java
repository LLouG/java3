package dayTwentyFive;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FilesAndReadingData {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<Person> people = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get("./dayTwentyFive/file.txt"))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                people.add(new Person(name, age));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Total amount of people read: " + people.size());

        for (Person peoples : people) {
            System.out.println(peoples.getName() + " is " + peoples.getAge() + " years old.");
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return this.name + " " + this.age;
    }
}