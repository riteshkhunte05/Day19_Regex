package regex;

public class Regex_main {

	public static void main(String[] args) {
		System.out.println("creating Regex Program");
		Userclass reg=new Userclass();
		System.out.print("validName is:");
		reg.ValidName();
		System.out.print("  LastName is:");
		reg.LastName();
		System.out.print("  Email is: ");
		reg.Email();
		System.out.print("  MobileNumber is: ");
		reg.Mobilenumb();
		System.out.print("  PassWord Rule1 is: ");
		reg.PasswordRule1();
		System.out.print("  PassWord Rule2 is: ");
		reg.PasswordRule2();
		System.out.print("  PassWord Rule3 is: ");
		reg.PasswordRule3();
		System.out.print("  PassWord Rule4 is: ");
		reg.PasswordRule4();
	}

}