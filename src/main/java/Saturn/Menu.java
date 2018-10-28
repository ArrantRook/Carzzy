package Saturn;

import java.util.Scanner;
public class Menu {
    public static void displayWelcomeMessage(){
        System.out.println("");
        System.out.println("***********************************************************************");
        System.out.println("        WELCOME to Carzzy, the only SUPERCAR rentals in the world!      ");
        System.out.println("***********************************************************************");
        System.out.println("");
    }

    public static int displayMainMenu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select from one of the following:");
        System.out.println("1. Sign Up \t 2. Log In \t 3. Rent a car \t 4. Check Our Prices");
        int userChoice = sc.nextInt();
        if(userChoice < 1 || userChoice > 4){
            System.out.println("Please enter a valid choice. Try again.");
            userChoice = displayMainMenu();
        }
        return userChoice;
    }
    public static int getUserCountry(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Carzzy is currently available in following countries:");
        System.out.println("1. India \t 2. Italy \t 3. Germany ");
        System.out.println("Select your country ");
        int userChoice = sc.nextInt();
        if(userChoice < 1 || userChoice > 3){
            System.out.println("Please enter a valid choice. Try again.");
            userChoice = getUserCountry();
        }
        return userChoice;
    }
    public static int getUserRentalChoice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CarID of the car you want to rent");
        System.out.println("Type 2 to change the country");
        System.out.println("Type 3 to exit App");
        return sc.nextInt();
    }
    public static int getNumberOfDaysOfRent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What day do you want to get your rented car? Please enter date in dd/mm/yyyy format");
        String firstDay = sc.nextLine();
        System.out.println("Type the time in the following format: HH:MM am/pm");
        String time = sc.nextLine();
        System.out.println("How many days do you want to rent the car for");
        return sc.nextInt();
    }
    public static void displayTermsAndConditions(){
        System.out.println("there will be no driver given. you will have to drive the car yourself");
        System.out.println("the  car will be provided with a filled tank of fuel and when you return" +
                " the car, it should have a full tank of fuel");

    }
    public static int confirmRentalAndGetNextUserChoice(float price, int noOfDays, Car cars){
        Scanner sc = new Scanner(System.in);
        System.out.println("Your car is " + cars.carCompany + " " + cars.carModel);
        System.out.println("You are renting the car for " + noOfDays + " days");
        System.out.println("The total amount to be paid is Rs " + price);
        System.out.println("1. Read our Terms & conditions \t 2. Continue with transaction");
        int userChoice = sc.nextInt();
        if(userChoice < 1 || userChoice > 2){
            System.out.println("Please enter a valid choice. Try again.");
            userChoice = confirmRentalAndGetNextUserChoice(price, noOfDays, cars);
        }
        return userChoice;
    }
}