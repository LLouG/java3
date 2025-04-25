package dayTwentyTwo;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("What is the size of the array? ");
        int howMany = Integer.valueOf(reader.nextLine());

        int[] numbers = new int[howMany];

        System.out.println("Enter the numbers to be added to the array: ");
        int index = 0;
        while (index < numbers.length) {
            numbers[index] = Integer.valueOf(reader.nextLine());
            index++;     
        }

        System.out.print("Provide the index number: ");
        int printIndex = Integer.valueOf(reader.nextLine());

        if (printIndex > numbers.length || printIndex < 0) {
            System.out.println("ERROR: index " + printIndex + " was not found.");
        } else {
            System.out.println("-- Starting the loop at the index " + printIndex + " --");
            while (printIndex < numbers.length) {
                System.out.println("Index: " + printIndex + " -> " + numbers[printIndex]);
                printIndex++;
            }
        }
    }
}
