package com.company.lection16.classWork1;

import static java.lang.Thread.sleep;

public class SetParkingPlace {
    private Car car;

    public synchronized void setParkingPlace(Car car, Parking parking){
        parking.setFreePlaces(car);
        System.out.println("Машина " + car.getName() +  " припарковалась");
        if (parking.isFreePlaces()) {
            notify();
        }
        else {
            try {
                sleep(car.getTimeOfParking());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Машина " + car.getName() +  " уехала");
            notify();
        }
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public SetParkingPlace(Car car, Parking parking) {
        this.car = car;
    }
}
