package Day11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try {
            
            BufferedReader reader = new BufferedReader(new FileReader("\"C:\\Users\\Dhanusha\\OneDrive\\Desktop\\Wipro-Training\\Welcome\\sample.txt\""));

            String line;
            System.out.println("Reading file using BufferedReader:\n");

           
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }
    }
}



