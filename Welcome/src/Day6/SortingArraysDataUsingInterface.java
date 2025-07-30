package Day6;

interface ArrayData{
	void sort(String[] arr);
}
class SortingArray implements ArrayData{
	
	public void sort(String[] arr) {		
		String temp="";
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].compareTo(arr[j])>=0){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
				System.out.print(arr[i]+"  ");
		}
		
		
	}
}
public class SortingArraysDataUsingInterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"sha","Vignesh","Shiva","Dhanu"};
		
		ArrayData a=new SortingArray();
		a.sort(arr);
	}
}



