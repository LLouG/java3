import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Hello");
        list.add(",");
        list.add("World!");

        System.out.println(list.get(2));
    }
}
