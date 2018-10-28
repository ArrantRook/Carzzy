package Saturn;

public class App
{
    private static Car[] carCollection = new Car[36];
    public static void main( String[] args )
    {
        setupSystem();
        kickStart();
    }
    private static void kickStart(){
        Car userCarChoice;
        Menu.displayWelcomeMessage();
        int userCountry = Menu.getUserCountry();
        displayCarList(userCountry);
        int rentalChoice;
        do{
            rentalChoice = Menu.getUserRentalChoice();
            if(rentalChoice == 3)
                System.exit(0);
            if(rentalChoice == 2) {
                kickStart();
                break;
            }
            else{
                userCarChoice = Search.searchCarByID(rentalChoice, carCollection);
                if(userCarChoice == null){
                    System.out.println("Invalid car choice, please enter a valid Car ID");
                }
                else{
                    int noOfDays = Menu.getNumberOfDaysOfRent();
                    float price = userCarChoice.getRentalPrice(noOfDays);
                    int postConfirmChoice = Menu.confirmRentalAndGetNextUserChoice(price, noOfDays, userCarChoice);
                    if (postConfirmChoice == 1) {
                        Menu.displayTermsAndConditions();
                    }
                    UserTransaction transaction = new UserTransaction();
                    transaction.completeUserTransaction();
                    kickStart();
                }
            }
        }
        while(userCarChoice == null);
    }

    private static void displayCarList(int userCountry){
        for(int i = 0; i < carCollection.length - 1; i++){
            if (carCollection[i].country == userCountry){
                System.out.println("Car ID: " + carCollection[i].carID);
                System.out.println("Car: " + carCollection[i].carCompany + " " + carCollection[i].carModel);
                System.out.println("No. of Seats: " + carCollection[i].iNoOfSeats);
                System.out.println("Ground Clearance: " + carCollection[i].groundClearance + "cm");
                System.out.println("Engine Power: " + carCollection[i].enginePower + " Horsepower");
                System.out.println("Type of car: " + CarType.getCarTypeName(carCollection[i].carType));
                System.out.println("Fuel Capacity: " + carCollection[i].fuelTankCapacity + "l");
                System.out.println("Fuel Type: " + FuelType.getFuelTypeName(carCollection[i].fuelType));
                System.out.println("Weekday Price: Rs " + carCollection[i].weekdayPrice);
                System.out.println("Weekend Price: Rs 2" + carCollection[i].weekendPrice);
                System.out.println("Registration Number: " + carCollection[i].registrationNumber + "\n \n");
            }
        }
    }
    private static void setupSystem(){
        carCollection[0] = new Car("GTR", "Nissan", 4,
                14, 562, CarType.SUPERCAR, 74, FuelType.PETROL,
                5000, 6000, OperatingCountry.INDIA, "KA 53 N 849", 110);

        carCollection[1] = new Car("R8", "Audi", 2,
                16, 542, CarType.SUPERCAR, 75, FuelType.PETROL,
                5000, 6000, OperatingCountry.INDIA, "DL 9C K 9908", 111);

        carCollection[2] = new Car("Huracan","Lamborghini", 2,
                15, 583, CarType.SUPERCAR, 81, FuelType.PETROL,
                5000, 6000, OperatingCountry.INDIA, "MH 34 L 6219",112);

        carCollection[3] = new Car("Aventador Lp-700", "Lamborghini", 2,
                10, 700, CarType.SUPERCAR, 90, FuelType.PETROL,
                5000, 8000, OperatingCountry.ITALY, "BE 127 AB", 113);

        carCollection[4] = new Car("488 GTB", "Ferrari", 2,
                15, 661, CarType.SUPERCAR, 78, FuelType.PETROL,
                7000, 10000, OperatingCountry.ITALY, "FI 058 DC", 114);

        carCollection[5] = new Car("LFA", "Lexus", 2,
                11, 553, CarType.SUPERCAR, 73, FuelType.PETROL,
                5500, 8500, OperatingCountry.ITALY, "AS 246 GH", 115);

        carCollection[6] = new Car("GT2 911", "Porsche", 2,
                12, 690, CarType.SUPERCAR, 64, FuelType.PETROL,
                6000, 9000, OperatingCountry.GERMANY, "GER MAN 09", 116);

        carCollection[7] = new Car("R8", "Audi", 2,
                16, 542, CarType.SUPERCAR, 75, FuelType.PETROL,
                5050, 8050, OperatingCountry.GERMANY, "KON MJH 67", 117);

        carCollection[8] = new Car("AMG GT","Mercedes", 2,
                10, 515, CarType.SUPERCAR, 73, FuelType.PETROL,
                7000, 9000, OperatingCountry.GERMANY, "REM GFS 45", 118);

        carCollection[9] = new Car("Ciaz", "Maruti Suzuki", 4,
                17, 95, CarType.SEDAN, 43, FuelType.PETROL,
                800, 1200, OperatingCountry.INDIA, "KA 39 B 6431", 119);

        carCollection[10] = new Car("Verna", "Hyundai", 4,
                16, 115, CarType.SEDAN, 45, FuelType.DIESEL,
                1000, 1350, OperatingCountry.INDIA, "MH 21 U 5408", 120);

        carCollection[11] = new Car("Panamera", "Porsche", 4,
                12, 326, CarType.SEDAN, 70, FuelType.PETROL,
                5000, 8000, OperatingCountry.INDIA, "DL 14 B 1381", 121);

        carCollection[12] = new Car("Gran Turismo", "Maserati", 4,
                17, 292, CarType.SEDAN, 88, FuelType.PETROL,
                4000, 5000, OperatingCountry.ITALY, "SF 849 BL", 122);

        carCollection[13] = new Car("Giulia Quadrifoglio", "Alfa Romeo", 4,
                10, 280, CarType.SEDAN, 58, FuelType.PETROL,
                4800, 5800, OperatingCountry.ITALY, "FJ 990 SG", 123);

        carCollection[14] = new Car("Quattroporte","Maserati", 4,
                12, 344, CarType.SEDAN, 80, FuelType.PETROL,
                5000, 7700, OperatingCountry.ITALY, "VB 219 TG", 124);

        carCollection[15] = new Car("A4", "Audi", 4,
                13, 181, CarType.SEDAN, 54, FuelType.PETROL,
                4700, 7400, OperatingCountry.GERMANY, "DF 3256 GH", 125);

        carCollection[16] = new Car("i8", "BMW", 4,
                15, 356, CarType.SEDAN, 42, FuelType.ELECTRIC,
                5800, 8200, OperatingCountry.GERMANY, "UH 6513 EV", 126);

        carCollection[17] = new Car("Maybach S650", "Mercedes", 4,
                14, 621, CarType.SEDAN, 80, FuelType.PETROL,
                6200, 8800, OperatingCountry.GERMANY, "EU 2689 YN", 127);

        carCollection[18] = new Car("Jazz", "Honda", 4,
                16, 93, CarType.HATCHBACK, 40, FuelType.PETROL,
                1000, 1400, OperatingCountry.INDIA, "KA 49 B 1469", 128);

        carCollection[19] = new Car("Swift", "Maruti Suzuki", 4,
                17, 101, CarType.HATCHBACK, 37, FuelType.DIESEL,
                1100, 1500, OperatingCountry.INDIA, "DL 35 H 5808", 129);

        carCollection[20] = new Car("Figo","Ford", 4,
                17, 98, CarType.HATCHBACK, 41, FuelType.PETROL,
                1000, 1400, OperatingCountry.INDIA, "MH 26 G 1057", 130);

        carCollection[21] = new Car("500", "Abarth", 4,
                10, 135, CarType.HATCHBACK, 35, FuelType.PETROL,
                3200, 3900, OperatingCountry.ITALY, "RB 165 KX", 131);

        carCollection[22] = new Car("Giulietta", "Alfa Romeo", 4,
                11, 237, CarType.HATCHBACK, 60, FuelType.PETROL,
                3500, 4200, OperatingCountry.ITALY, "AV 516 BB", 132);

        carCollection[23] = new Car("FF", "Ferrari", 4,
                12, 663, CarType.HATCHBACK, 91, FuelType.PETROL,
                10000, 18000, OperatingCountry.ITALY, "BN 529 UT", 133);

        carCollection[24] = new Car("i3", "BMW", 4,
                14, 167, CarType.HATCHBACK, 46, FuelType.ELECTRIC,
                4000, 4900, OperatingCountry.GERMANY, "FK 4726 SJ", 134);

        carCollection[25] = new Car("Up!", "Volkswagen",  4,
                16, 542, CarType.HATCHBACK, 75, FuelType.PETROL,
                3500, 4100, OperatingCountry.GERMANY, "BC 9285 NM", 135);

        carCollection[26] = new Car("S1","Audi", 4,
                12, 227, CarType.HATCHBACK, 50, FuelType.PETROL,
                3900, 4600, OperatingCountry.GERMANY, "ZH 2369 GH", 136);

        carCollection[27] = new Car("Fortuner", "Toyota", 7,
                22, 174, CarType.SUV, 50, FuelType.DIESEL,
                1100, 1800, OperatingCountry.INDIA, "MH 92 T 4013", 137);

        carCollection[28] = new Car("XUV500", "Mahindra", 7,
                17, 139, CarType.SUV, 70, FuelType.PETROL,
                1200, 1900, OperatingCountry.INDIA, "KA 82 B 7138", 138);

        carCollection[29] = new Car("Endeavour", "Ford", 7,
                22, 158, CarType.SUV, 80, FuelType.DIESEL,
                1300, 2000, OperatingCountry.INDIA, "DL 76 K 1724", 139);

        carCollection[30] = new Car("Urus", "Lamborghini", 7,
                25, 562, CarType.SUV, 85, FuelType.PETROL,
                12000, 20000, OperatingCountry.ITALY, "FN 121 ER", 140);

        carCollection[31] = new Car("Levante", "Maserati", 7,
                20, 344, CarType.SUV, 80, FuelType.PETROL,
                10000, 18000, OperatingCountry.ITALY, "AS 562 DF", 141);

        carCollection[32] = new Car("500X","Fiat", 7,
                16, 138, CarType.SUV, 48, FuelType.PETROL,
                9500, 15000, OperatingCountry.ITALY, "QW 625 TY", 142);

        carCollection[33] = new Car("X6", "BMW", 7,
                19, 567, CarType.SUV, 85, FuelType.PETROL,
                18000, 25000, OperatingCountry.GERMANY, "ZX 2936 CV", 143);

        carCollection[34] = new Car("Q7", "Audi", 7,
                21, 268, CarType.SUV, 50, FuelType.PETROL,
                18000, 25000, OperatingCountry.GERMANY, "LK 6478 JH", 144);

        carCollection[35] = new Car("Cayene", "Porsche", 7,
                21, 295, CarType.SUV, 49, FuelType.PETROL,
                20000, 27000, OperatingCountry.GERMANY, "PO 3897 RE", 145);
    }
}