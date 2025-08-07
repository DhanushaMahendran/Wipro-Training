package Practice;
//Count the frequency of each Character in a string

import java.util.*;


public class Charfrequency {
	public static void main(String[] args) {
		String input = "interviewready";
		Map<Character, Integer>freqMap = new HashMap<>();
		
		for(char ch : input.toCharArray()) {
			freqMap.put(ch,freqMap.getOrDefault(ch, 0) + 1);
			
		}
		for (Map.Entry<Character, Integer>entry:freqMap.entrySet()) {
			System.out.println(entry.getKey()+ ":" +entry.getValue());
			
		}
		
	}

}
