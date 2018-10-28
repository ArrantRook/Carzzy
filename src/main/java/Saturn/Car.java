package Saturn;

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
    public float getRentalPrice(int noOfDays){
        float price = weekdayPrice * noOfDays;
        return price;
    }
}