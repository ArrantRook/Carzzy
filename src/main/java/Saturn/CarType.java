package Saturn;

public class CarType {
    public static int SUPERCAR = 1;
    public static int SEDAN = 2;
    public static int HATCHBACK = 3;
    public static int SUV = 4;

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
