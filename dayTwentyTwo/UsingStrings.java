package dayTwentyTwo;

import java.util.Scanner;

public class UsingStrings {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String quote = "It's because one doesn't do not because one can't.";

        /* System.out.println("What's your name? ");
        String name = reader.nextLine();

        if (!name.equals("Loug")) {
            System.out.println("Hello, stranger.");
        } else {
            String myStr = "Hello, " + name + ".";
            if (myStr.endsWith(".")) {
                System.out.println(myStr.replace(".", "!"));
            }
        } */

        int oldest = 0;
        String personOldest = "";

        while (true) {
            System.out.println("Please input the person's name and age below using the PERSON,AGE format.");
            String input = reader.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] pieces = input.split(",");
            System.out.println("Name: " + pieces[0] + ", age: " + pieces[1] + " was successfully added.");
            System.out.println("");

            if (Integer.valueOf(pieces[1]) > oldest) {
                oldest = Integer.valueOf(pieces[1]);
                personOldest = pieces[0];          
            }
        }

        if (oldest > 0 && !personOldest.equals("")) {    
            System.out.println(personOldest + " is the oldest with the age of " + oldest);
        }
        
    }
}
