package dayTwentyThree;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(  String initialname) {
        this.age = 0;
        this.height = 0;
        this.weight = 0;
        this.name = initialname;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public String toString() {
        return "Person name: " + this.name + "\nAge: " + this.age + " years old \nbody mass index is: " + bodyMassIndex();
    }

    public String getName() {
        return this.name;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }
}
