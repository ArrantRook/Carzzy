package Saturn;

import java.util.Scanner;
public class User {
    public static void signSUp()
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
        System.out.println("1. Italy \t 2. India");
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
