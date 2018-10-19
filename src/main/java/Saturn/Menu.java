package Saturn;

import java.util.Scanner;
public class Menu {
    public static int displayMainMenu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Carzzy");
        System.out.println("Select from one of the following:");
        System.out.println("1. Sign Up \t 2. Log In \t 3. Rent a car \t 4. Check Our Prices");
        // TODO: 10/19/18 Put a validation where program keeps asking for a valid choice in case user types something different
        return sc.nextInt();
    }
}