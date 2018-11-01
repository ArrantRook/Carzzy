package Saturn;
/** this class lists all the operating countries and has the ability to return their names as String **/
public class OperatingCountry {
    public static int INDIA = 1;
    public static int ITALY = 2;
    public static int GERMANY = 3;
    /** returns the String values of the different operating countries **/
    public static String getCountryName(int countryId){
        String userCountry;
        switch (countryId){
            case 1:
                userCountry = "India";
                break;
            case 2:
                userCountry = "Italy";
                break;
            case 3:
                userCountry = "Germany";
                break;
            default:
                userCountry = null;
        }
        return userCountry;
    }
}