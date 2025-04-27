package dayTwentyThree;

// the --static-- modifier indicates that the method in question 
// does not belong to an object and thus cannot be used to access any 
// variables that belongs to objects

// TODO: reserve a day to do the exercises at https://java-programming.mooc.fi/part-4/1-introduction-to-object-oriented-programming

public class Oop {
    public static void main(String[] args) {
        Person haejoon = new Person("Haejoon");
        haejoon.setHeight(197);
        haejoon.setWeight(90);
        haejoon.setAge(20);
        System.out.println(haejoon.toString()); // .toString() is not required here
    }
}