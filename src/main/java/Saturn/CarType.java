package Saturn;
/** this class lists all the car types and has the ability to return their names as String **/
public class CarType {
    public static int SUPERCAR = 1;
    public static int SEDAN = 2;
    public static int HATCHBACK = 3;
    public static int SUV = 4;
    /** returns the String values of the different car types **/
    public static String getCarTypeName(int carTypeValue) {
        if (carTypeValue == SUPERCAR)
            return "Supercar";
        else if (carTypeValue == SEDAN)
            return "Sedan";
        else if (carTypeValue == HATCHBACK)
            return "Hatchback";
        else if (carTypeValue == SUV)
            return "SUV";
        else
            return "NA";
    }
}
