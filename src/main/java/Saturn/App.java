package Saturn;

public class App
{
    public static void main( String[] args )
    {
        kickStart();

    }
    private static void kickStart(){
        menuChoice(Menu.displayMainMenu());
    }
    private static void menuChoice(int iChoice)
    {
        switch (iChoice){
            case 1:
                User.signSUp();
                break;
            case 2:
                User.login();
                break;
            case 3:
                RentCar.rent();
                break;
            case 4:
                break;
        }
    }
}