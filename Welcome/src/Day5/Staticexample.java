package Day5;

class InputValidator{
	static boolean isValidAmount(double amount) {
		return amount>0;
	}
}
public class Staticexample {
	public static void main (String[] args) {
		System.out.println(InputValidator.isValidAmount(500));
		System.out.println(InputValidator.isValidAmount(500));
		
	}

}
