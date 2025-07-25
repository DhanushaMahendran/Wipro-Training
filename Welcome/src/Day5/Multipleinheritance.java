package Day5;

interface EmailSender {
	void sendMessage(String message);
	
}

interface SMSSender{
	void sendMessage(String message);
}
class NotificationService implements EmailSender, SMSSender {
	public void sendMessage(String message) {
		System.out.println("Sending notification: " + message);
	}
	
}
public class Multipleinheritance {
	public static void main(String[] args ) {
		NotificationService service = new NotificationService();
		service.sendMessage("Your OTP is 98765");
	}

}
