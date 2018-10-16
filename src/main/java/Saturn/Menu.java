package Saturn;

import java.util.Scanner;
public class Menu {
    public static void displayMainMenu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Carzzy");
        System.out.println("Select from one of the following:");
        System.out.println("1. Sign Up \t 2. Log In \t 3. Search Cars \t 4. Check Our Prices");
        String choice = sc.nextLine();
    }
}