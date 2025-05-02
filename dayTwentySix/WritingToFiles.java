package dayTwentySix;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class WritingToFiles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String path = "./dayTwentySix/namesList.txt";
        String userInput = "";
        boolean appendToFile = true; // use ->false<- to overwrite
        
        System.out.println("Name to be added to the file (type quit to end)");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, appendToFile))) {
            while (userInput != "quit") {
                userInput = scan.nextLine();
                
                if (userInput.equals("quit")) {
                    break;
                }

                writer.write(userInput + "\n");
            }
            
            // writer.close() is not required if writer is declared in try()
            // writer.close();
        } catch (Exception err) {
            err.printStackTrace();
        } finally {
            JOptionPane.showMessageDialog(null, "Program ended.");
        }
    }
}
