package baseCourseOfJava.lection9collections.HomeWork5;

public class ParkingPlace {

    private boolean parkingPlace;
    private int idCar;

    public int getId() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public boolean isParkingPlace() {
        return parkingPlace;
    }

    public void setParkingPlace(boolean parkingPlace) {
        this.parkingPlace = parkingPlace;
    }

    public ParkingPlace() {
        this.parkingPlace = false;
    }
}
