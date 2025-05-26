package dayTwentyNine;

import dayTwentyThree.Person;

public class AmusementParkRide {
    private String name;
    private int lowestHeight;
    private int visitors;
    
    public AmusementParkRide(String name, int lowestHeight) {
        this.name = name;
        this.lowestHeight = lowestHeight;
        this.visitors = 0;
    }

    public Boolean allowedToRide(Person person) {
        if (person.getHeight() < lowestHeight) {
            return false;
        }
        visitors++;
        return true;        
    }

    public String toString() {
        return "Ride name: " + name + "\nMinimum height: " + lowestHeight + "\nVisitors today: " + visitors;
    }
}