package dayTwentyFour;

import java.util.ArrayList;
import java.util.Scanner;

public class ListObj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();

        System.out.println("Enter name and age separated by a comma, e.g.: Loug,32 ");
        while (true) {
            System.out.print("Enter the details, empty will stop: ");
            String details = scanner.nextLine();
            if (details.isEmpty()) {
                break;
            }

            String[] parts = details.split(",");
            String name = parts[0];
            int age = Integer.valueOf(parts[1]);
            persons.add(new Person(name, age));
        }
        
        System.out.println();        
        System.out.println("Total of names: " + persons.size());
        
        System.out.println("What is the minimum age?");
        int minAge = Integer.valueOf(scanner.nextLine());

        System.out.println("Persons: ");
        for (Person person : persons) {
            if(person.getAge() >= minAge){
                System.out.println(person);
            }
        }
    }
}