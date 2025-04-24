import java.util.ArrayList;
import java.util.Scanner;

public class Lists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String myStr = "";
        int sum = 0;

        while (true) {
            System.out.print("Type a number (0 to quit): ");
            int userInput = Integer.valueOf(scanner.nextLine());
            sum += userInput;
            list.add(userInput);

            if (userInput != 0) {
                System.out.println("Added " + userInput + " to the list.");
            }

            if (userInput == 0) {
                list.removeLast();
                break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            myStr += list.get(i) + " ";
        }
        System.out.println("The sum of " + myStr + "is " + sum);
    }
}
