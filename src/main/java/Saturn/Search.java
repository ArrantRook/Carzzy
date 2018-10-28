package Saturn;

public class Search {
    public static Car searchCarByID(int carID, Car[] carCollecthion){
        for (int i = 0; i < carCollecthion.length - 1; i++) {
            if (carCollecthion[i].carID == carID)
                return carCollecthion[i];
        }
        return null;
    }
}
