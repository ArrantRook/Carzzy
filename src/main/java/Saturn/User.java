package Saturn;

import java.util.Scanner;
public class User {
    String userName;
    long userContact;
    String userEmail;
    String userAdress;

    User(String userName, long userContact, String userEmail, String userAdress){
        this.userName = userName;
        this.userContact = userContact;
        this.userEmail = userEmail;
        this.userAdress = userAdress;
    }

    public static void signUp()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter your name");
        String name = sc.nextLine();
        System.out.println("Kindly enter a password");
        String password = sc.nextLine();
        System.out.println("Kindly enter your contact number");
        String contact = sc.nextLine();
        System.out.println("Kindly enter E-mail address");
        String email = sc.nextLine();
        System.out.println("Kindly choose your country");
        System.out.println("1. Italy \t 2. India \t 3. Germany");
        String country = sc.nextLine();
    }
    public static void login()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter your name");
        String name = sc.nextLine();
        System.out.println("Kindly enter a password");
        String password = sc.nextLine();
    }
}
