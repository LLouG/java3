package dayTwentySix;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFiles {
    public static void main(String[] args) {
        FileWriter fWriter;
        try {
            fWriter = new FileWriter("./dayTwentySix/namesList.txt");
            BufferedWriter writer = new BufferedWriter(fWriter);
            writer.write("Hi");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
