import java.util.ArrayList;
import java.util.Scanner;

public class Lists {
    public static void main(String[] args) {
        AddToList addToList = new AddToList();
        addToList.addTolist();
        System.out.println(addToList.findSum());
        System.out.println(addToList.findSmallest());
    }
}

// TODO find a way to implement the smallest method into the Smallest class
/* class Smallest extends AddToList{
    ArrayList<Integer> smallestArr = new ArrayList<>();
    int smallest = numArr.get(0);

    public void small() {
        for (int i = 0; i < smallestArr.size(); i++) {
            int num = smallestArr.get(i);
            if (smallest > num) {
                smallest = num;
            }
        }
    }
} */

class AddToList {
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> numArr = new ArrayList<>(); 
    String finalStr = "";
    int sum = 0;
    
    public void addTolist() {
        while (true) {
            System.out.print("Say a number (0 to quit): ");            
            int userInput = Integer.valueOf(scan.nextLine());

            if (userInput != 0) {
                numArr.add(userInput);
                System.out.println(userInput + " was added to the list.");
            }
            
            if (userInput == 0) {
                break;
            }
        }

        for (int i = 0; i < numArr.size(); i++) {
            finalStr += numArr.get(i) + " and "; // TODO learn how to remove the last " and "
        }
    }

    public String findSum() {
        for (Integer integer : numArr) {
            sum += integer;            
        }

        // System.out.println("The sum of " + finalStr + "is " + sum);
        return "The sum of " + finalStr + "is " + sum;
    }

    public String findSmallest() {
        int smallest = numArr.get(0);

        for (int i = 0; i < numArr.size(); i++) {
            int num = numArr.get(i);

            if (smallest > num) {
                smallest = num;
            }
        }
        return "The smallest number was " + smallest;
    }
}