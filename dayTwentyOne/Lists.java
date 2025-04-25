import java.util.ArrayList;
import java.util.Scanner;

public class Lists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* AddToList addToList = new AddToList();
        addToList.addTolist();
        System.out.println(addToList.findSum());
        System.out.println(addToList.findSmallest()); */

        /* ArrayList<String> myList = new ArrayList<>();
        ReturnList returnList = new ReturnList();
        returnList.print(myList); */

        ReturnSmallest returnSmallest = new ReturnSmallest();
        ArrayList<Integer> myNumList = new ArrayList<>();

        while (myNumList.size() < 5) {
            System.out.print("Say a number: ");
            myNumList.add(Integer.valueOf(scan.nextLine()));
        }

        if (myNumList.size() == 5) {
            returnSmallest.returnSmallest(myNumList, 7);;
        }
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

            if (userInput != 0 && userInput >= 1) {
                numArr.add(userInput);
                System.out.println(userInput + " was added to the list.");
            }
            
            if (userInput <= 0) {
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

class ReturnList {
    public static void print(ArrayList<String> list) {
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("Type a word to be added to the list (leave it empty to quit)");
            String userInput = String.valueOf(scan.nextLine());

            if (userInput == "") {
                list.remove(userInput);
                break;
            } else {
                list.add(userInput);     
                System.out.println(userInput + " was added to the list.");           
            }            
        }

        for (String value : list) {
            System.out.print(value + " ");
        }
    }
}

class ReturnSmallest {
    public void returnSmallest(ArrayList<Integer> nums, int threshhold) {for (Integer num : nums) {
            if (num < threshhold) {
                System.out.println(num);
            }
        }
    }
}