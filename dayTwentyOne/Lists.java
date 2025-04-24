import java.util.ArrayList;
import java.util.Scanner;


public class Lists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Type a number (0 to quit): ");
            int userInput = Integer.valueOf(scanner.nextLine());
            list.add(userInput);
            
            if (userInput == 0) {
                list.removeLast();
                break;
            }
        }

        for (int i = 0; i < list.size(); i++) {;
            System.out.print(list.get(i) + " ");
        }
    }
}
