package Day10;


import java.io.FileWriter;
import java.io.IOException;

public class writetosimplefile1 {
	
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("C:\\Users\\Dhanusha\\OneDrive\\Desktop\\Wipro-Training");
					
			writer.write("Hello, I am trying to find testing tools for ITC project\n");
			writer.write("Tools like automation and performance tools\n ");
			
			writer.close();
			
			System.out.println("Data written to file successfully.");
			
	}catch(IOException e) {
		System.out.println("An error occured while writting to the file.");
		e.printStackTrace();
	}
	}

}
