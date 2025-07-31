package Day9;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collections_Comparable {
	
	public static void main(String[] args) {
		Comparator<Integer> C1 = new Comparator<Integer>() {
			public int compare(int i,int j) {
				if(i%10 > j%10)
					return 1;
				else
					return -1;
			}

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		
		};
		
		ArrayList <Integer>marks = new ArrayList();
		marks.add(34);
		marks.add(14);
		marks.add(84);
		marks.add(44);
		System.out.println(marks);
		
		Collections.sort(marks,C1);
		System.out.println(marks);
				
	}

}

