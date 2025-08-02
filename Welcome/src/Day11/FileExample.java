package Day11;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        try {
            // 1️⃣ Create a file
            File myFile = new File("sample.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }

            // 2️⃣ Write to the file
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Hello Dhanu!\nWelcome to Java File Handling.");
            writer.close();
            System.out.println("Successfully wrote to the file.");

            // 3️⃣ Read from the file
            FileReader reader = new FileReader("sample.txt");
            int ch;
            System.out.println("Reading file content:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}



