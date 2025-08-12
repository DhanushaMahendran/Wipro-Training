package Day10;

import java.util.ArrayList;
import java.util.Collections;

public class D_Collections {

	class department{
		
		
		private String name;
		private double sales;
		private double expenses;
		
		public department(String name,double sales, double expenses) {
			this.name=name;
			this.sales=sales;
			this.expenses=expenses;
			
		}
		public double getProfit() {
			return sales-expenses;
		}
		
		public String getName() {
			return name;
		}
	}
	public static void main(String[] args) {
		ArrayList<department> dept =new ArrayList<>();
		dept.add(new D_Collections().new department("Sales",20000,1500));
		dept.add(new D_Collections().new department("Marketing",3000,2000));
		dept.add(new D_Collections().new department("Reasearch",5000,3000));
		
		
		for(department d : dept) {
			System.out.println(d.getName() + "Profit: " + d.getProfit());
		}
		
		dept.sort((d1, d2) -> Double.compare(d2.getProfit(), d1.getProfit()));
		
		System.out.println("Sorting Done");
		for(department d: dept) {
			System.out.println(d.getName() + "Profit: " + d.getProfit());
		}
		

		
	}
}
