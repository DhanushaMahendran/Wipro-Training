package Day5;

interface Bankaccount{
	default void displayaccounttype() {
		System.out.println("Account type : Genric Account");
		
	}
}

class Savingaccount1 implements Bankaccount{
	public void Savingaccount() {
		System.out.println("Interest:6%");
		
	}
}

public class Defaultexample {
	public static void main(String[] args) {
		Bankaccount b = new Savingaccount1();
		b.displayaccounttype();
		Savingaccount1 sa = new Savingaccount1();
		sa.Savingaccount();
		sa.displayaccounttype();
		
	}

}
