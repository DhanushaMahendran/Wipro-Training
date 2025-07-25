package Day4;

import java.util.Scanner;  // Import the Scanner class for user input
public class Entername {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Ask the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Read the user's input as a string
        // Print a personalized greeting
        System.out.println("Hello, " + name + "! Welcome to the Java program.");
        // Close the scanner to avoid resource leak
        scanner.close();
    }
}



