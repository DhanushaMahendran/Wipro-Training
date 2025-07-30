package Day8;

import java.util.LinkedList;
import java.util.List;
import java.util.Collection;


public class Collections_LinkedList {
	public static void main(String[] args) {
		List<Integer> data = new LinkedList<Integer>();
		data.add(10);
		data.add(12);
		data.add(14);
		System.out.println(data.get(0));
		System.out.println(data.indexOf(13));
		
		
		for (Object i : data) {
			int data1 = (Integer) i;
			System.out.println(data1);
		}		
	}

}
