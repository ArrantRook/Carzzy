package Saturn;

import java.util.Scanner;
public class UserTransaction {
    private String cardNumber;
    private String cvv;
    private String otp;

    public void completeUserTransaction(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your card number");
        cardNumber = sc.nextLine();
        System.out.println("Enter your cvv");
        cvv = sc.nextLine();
        System.out.println("Enter OTP given to you in your phone");
        otp = sc.nextLine();
        System.out.println("Your car will be delivered to your address on your given date and time. THANK YOU for using Carzzy, the only SUPERCAR rentals in the world!");
        System.out.println("Please Enter to get another car!");
        sc.nextLine();
    }
}
