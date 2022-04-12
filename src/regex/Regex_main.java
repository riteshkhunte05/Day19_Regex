package regex;

public class Regex_main {
    public static void main(String[] args) {
        System.out.println("Welcome to the User Registration Problem using Regex!!");
        Userclass user = new Userclass();
        user.firstName("Ritesh");
        user.lastName("Khunte");
        user.emailaddress("riteshkhunte05@gmail.com");
        user.mobileNo("+91 9168112901");
        user.passRule1("Pass@123");
        user.passwordRule2("PASS@123");
        user.passwordRule3("Ritesh@5");
        user.passwordRule4("Hello@123");
    }
}