package Saturn;
/** this class lists all the fuel types and has the ability to return their names as String **/
public class FuelType {
    public static int PETROL = 1;
    public static int DIESEL = 2;
    public static int ELECTRIC = 3;
    /** returns the String values of the different fuel types **/
    public static String getFuelTypeName(int fuelTypeValue) {
        if (fuelTypeValue == PETROL)
            return "Petrol";
        else if (fuelTypeValue == DIESEL)
            return "Diesel";
        else if (fuelTypeValue == ELECTRIC)
            return "Electric";
        else
            return "NA";
    }
}
