import java.util.Scanner;

public class DiscoveringErrors {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.getCustomerNumber();
    }
}

class AskInput {
    Scanner scanner = new Scanner(System.in);
    int values = 0;
    int sum = 0;

    public void askInput() {

        while (true) {
            System.out.println("-- values: " + values + ", sum: " + sum);

            System.out.println("Provide a value, negative values end the program: ");
            int value = Integer.valueOf(scanner.nextLine());
            if (value < 0) {
                System.out.println("-- value is negative, exiting loop");
                break;
            }
            values++;
            sum += value;
        }

        System.out.println("-- loop exited");
        System.out.println("-- values " + values + ", sum " + sum);

        if (sum == 0) {
            System.out.println("The average of the values could not be calculated.");
        } else {
            System.out.println("Average of values: " + (1.0 * sum / values));
        }
    }
}

class Customer {
    Scanner scanner = new Scanner(System.in);

    public void getCustomerNumber() {
        System.out.println("Customer number is: ");
        int userInput = Integer.valueOf(scanner.nextLine());

        System.out.println("-- customer number is: " + userInput);
        if (userInput >= 1000 && userInput % 25 == 0) {
            System.out.println("Gets a gift card!");
        } else if (userInput % 2000 == 0) {
            System.out.println("Gets a large gift card!");
        } else {
            System.out.println("Gets nothing.");
        }
    }
}