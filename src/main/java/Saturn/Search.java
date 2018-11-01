package Saturn;
/** searches for the car that the useer has decided to **/
public class Search {
    public static Car searchCarByID(int carID, Car[] carCollection){
        for (int i = 0; i < carCollection.length - 1; i++) {
            if (carCollection[i].carID == carID)
                return carCollection[i];
        }
        return null;
    }
    /** requires car ID to find the car and country so that user cant enter a car from a country that he/she
     * is not in by accident **/
    public static Car searchCarByIDAndCountry(int carID, int country, Car[] carCollection){
        for (int i = 0; i < carCollection.length - 1; i++) {
            if (carCollection[i].carID == carID && carCollection[i].country == country)
                return carCollection[i];
        }
        return null;
    }
}