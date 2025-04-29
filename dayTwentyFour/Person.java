package dayTwentyFour;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // If the object's properties need to be changed after creation (mutable object), then setters are necessary. While the constructor initializes the object's initial state, setters provide a mechanism to modify that state later on.

   /* public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    } */

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return this.name + ", age: " + this.age;
    }
}