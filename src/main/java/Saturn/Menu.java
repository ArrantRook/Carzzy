package Saturn;

import java.util.Scanner;
public class Menu {
    public static int displayMainMenu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select from one of the following:");
        System.out.println("1. Sign Up \t 2. Log In \t 3. Rent a car \t 4. Check Our Prices");
        // TODO: 10/19/18 Put a validation where program keeps asking for a valid choice in case user types something different
        return sc.nextInt();
    }
    public static int getUserCountry(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Carzzy is currently available in following countries:");
        System.out.println("1. India \t 2. Italy \t 3. Germany ");
        System.out.println("Select your country ");
        // TODO: 10/19/18 Put a validation where program keeps asking for a valid choice in case user types something different
        return sc.nextInt();
    }
    public static int getUserRentalChoice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CarID of the car you want to rent");
        System.out.println("Type 2 to change the country");
        System.out.println("Type 3 to exit App");
        int userChoice = sc.nextInt();
        return userChoice;
    }
//    public static int getNumberOfDaysOfRent(){
//
//    }
}