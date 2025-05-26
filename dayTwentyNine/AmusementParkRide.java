package dayTwentyNine;

import dayTwentyThree.Person;

public class AmusementParkRide {
    private String name;
    private int lowestHeight;
    
    public AmusementParkRide(String name, int lowestHeight) {
        this.name = name;
        this.lowestHeight = lowestHeight;
    }

    public Boolean allowedToRide(Person person) {
        if (person.getHeight() < lowestHeight) {
            return false;
        }
        return true;        
    }

    public String toString() {
        return name + ", " + lowestHeight;
    }
}