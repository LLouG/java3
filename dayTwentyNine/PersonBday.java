package dayTwentyNine;

public class PersonBday {
    private String name;
    private SimpleDate simpleDate;
    
    public PersonBday(String name, SimpleDate simpleDate) {
        this.name = name;
        this.simpleDate = simpleDate;
    }

    public PersonBday(String name, int day, int month, int year) {
        this.name = name;
        this.simpleDate = new SimpleDate(day, month, year);
    }

    public String toString() {
        return this.name + ", born on " + this.simpleDate;
    }
}
