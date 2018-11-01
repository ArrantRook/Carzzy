package Saturn;

/** has all the common properties and functions of the rental cars **/
public class Car {
    String carModel;
    String carCompany;
    int iNoOfSeats;
    float groundClearance;
    int enginePower;
    int carType;
    long fuelTankCapacity;
    int fuelType;
    float weekdayPrice;
    float weekendPrice;
    int country;
    String registrationNumber;
    int carID;

    /** constructor assigns values to all the variables above **/
    /** gets values of the properties that all the cars would have **/
    Car(String modelName, String carCompanyName,int numberOfSeats, float groundClearance,
        int enginePower, int carType, long fuelTankCapacity, int fuelType, float weekdayPrice,
        float weekendPrice, int country, String registrationNumber, int carID)
    {

        this.carModel = modelName;
        this.carCompany = carCompanyName;
        this.iNoOfSeats = numberOfSeats;
        this.groundClearance = groundClearance;
        this.enginePower = enginePower;
        this.carType = carType;
        this.fuelTankCapacity = fuelTankCapacity;
        this.fuelType = fuelType;
        this.weekdayPrice = weekdayPrice;
        this.weekendPrice = weekendPrice;
        this.country = country;
        this.registrationNumber = registrationNumber;
        this.carID = carID;
    }
    /** calculates the price of the car that the user is renting depending on how long he/she is using it for **/
    public float getRentalPrice(int noOfDays){
        return weekdayPrice * noOfDays;
    }
}