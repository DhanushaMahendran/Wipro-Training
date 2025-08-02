package Day11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try {
            // Open the file using BufferedReader
            BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));

            String line;
            System.out.println("Reading file using BufferedReader:\n");

            // Read line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the file
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }
    }
}



