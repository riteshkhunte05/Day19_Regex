package regex;

public class Email {
	private static final String[] validEmailIds = new String[] { "abc@yahoo.com", "abc-100@yahoo.com",
			"abc.100@yahoo.com", "abc111@yahoo.com", "abc-100@abc.net",
			"abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com",
			"abc+100@gmail.com"};


	public static void main(String args[]) {
		Emailvalidator emailValidator = new Emailvalidator();
		for (String temp : validEmailIds) {
			boolean valid = emailValidator.validateEmail(temp);
			System.out.println("Email ID " + temp + " is valid? " + valid);
		}
}
}
