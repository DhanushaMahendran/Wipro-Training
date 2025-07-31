package Day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DCollections {
	
	public static void main(String[] args) {
		ArrayList<String> courses = new ArrayList<>();
		courses.add("Java");
		courses.add("Python");
		courses.add("Ruby");
		courses.add("java");
		for(String c : courses) {
			System.out.println(c);
		}
		
		Set <Integer>Courses = new HashSet<>();
		Courses.add(10);
		Courses.add(15);
		Courses.add(16);
		Courses.add(18);
		
		for(Integer j : Courses) {
			System.out.println(j);
		}
		Map<String,Integer> Courseduration = new HashMap<>();
		Courseduration.put("java" , 10);
		Courseduration.put("python" , 15);
		Courseduration.put("Ruby" , 16);
		Courseduration.put("java" , 18);
		for(String c:Courseduration.keySet()) {
			System.out.println(c + "=" +Courseduration.get(c));
			
		}
		
		
		
		
		
		
	}

}
