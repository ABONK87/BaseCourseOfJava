package baseCourseOfJava.lection10.HomeWork5;

import java.util.List;

public class Car {
    private int idCar;

    public void run(List<ParkingPlace> parking) {
        for (ParkingPlace p: parking) {
            if (!p.isParkingPlace()) {
                p.setParkingPlace(true);
                p.setIdCar(idCar);
            }
        }
    }

}
