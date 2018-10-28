package Saturn;

import java.util.Scanner;
public class UserTransaction {
    String cardNumber;
    String cvv;
    String otp;

    public void completeUserTransaction(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your card number");
        cardNumber = sc.nextLine();
        System.out.println("Enter your cvv");
        cvv = sc.nextLine();
        System.out.println("Enter OTP given to you in your phone");
        otp = sc.nextLine();
        System.out.println("THANK YOU for using Carzzy, the only SUPERCAR rentals in the world!");
    }
}
