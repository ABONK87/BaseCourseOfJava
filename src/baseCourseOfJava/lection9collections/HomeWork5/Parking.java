package baseCourseOfJava.lection9collections.HomeWork5;

import java.util.ArrayList;
import java.util.List;

public class Parking {

    private int numOfParkingPlace;

    public Parking(int numOfParkingPlace) {
        this.numOfParkingPlace = numOfParkingPlace;
        List<ParkingPlace> parking = new ArrayList<>(numOfParkingPlace);
    }

}
