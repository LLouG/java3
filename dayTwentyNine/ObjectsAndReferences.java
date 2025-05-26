package dayTwentyNine;

import dayTwentyThree.Person;

public class ObjectsAndReferences {
    public static void main(String[] args) {
        /* Books book = new Books("Three Kingdoms");
        book.setPages(251);

        BooksPages pages = new BooksPages(250);
        System.out.println(pages.minPages(book)); */
   
        /* Person mari = new Person("Mari");
        mari.setHeight(154);

        Person haejoon = new Person("Haejoon");
        haejoon.setHeight(179);

        AmusementParkRide waterTrack = new AmusementParkRide("Water Track", 155);

        if (waterTrack.allowedToRide(mari)) {
            System.out.println(mari.getName() + " may enter the ride.");
        } else {
            System.out.println(mari.getName() + " may NOT enter the ride.");
        }

        if (waterTrack.allowedToRide(haejoon)) {
            System.out.println(haejoon.getName() + " may enter the ride.");            
        } else {
            System.out.println(haejoon.getName() + " may NOT enter the ride.");
        }

        System.out.println(waterTrack); */

        SimpleDate simpleDate = new SimpleDate(1, 1, 780);
        PersonBday muhammad = new PersonBday("Muhammad ibn Musa al-Khwarizmi", simpleDate);
        PersonBday pascal = new PersonBday("Blaise Pascal", 19, 6, 1923);

        System.out.println(muhammad);
        System.out.println(pascal);
    }
}