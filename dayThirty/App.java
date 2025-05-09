package dayThirty;

public class App {
    public static void main(String[] args) {
        System.out.println("Time for some exercises!");

        Age first = new Age(32);
        System.out.println(first);
        first.growOlder();
        System.out.println(first);

        Age second = first;
        second.growOlder();
        System.out.println(first);
    }
}


class Age {
    private int age;

    public Age(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void growOlder() {
        this.age++;
    }

    public String toString() {
        return "[" + this.age + "]";
    }
}