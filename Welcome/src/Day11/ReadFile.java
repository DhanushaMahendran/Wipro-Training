package Day11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) throws IOException , ClassNotFoundException {
		FileReader reader = null;
		try {
			reader = new FileReader("C:\\Users\file.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int ch;
		while((ch=reader.read())!=-1) {
			System.out.println((char) ch);
			
		}
	}

}
