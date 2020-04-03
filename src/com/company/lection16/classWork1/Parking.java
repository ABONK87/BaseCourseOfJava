package com.company.lection16.classWork1;

import java.util.List;

public class Parking {
    private int countOfPlaces;
    private int countOfFreePlaces;
    private List <ParkingPlace> parkingPlaces;
//    private boolean isFreePlaces;
    private Car car;

    public  void setFreePlaces(Car car) {
        if (countOfFreePlaces > 0) {
            this.car = car;
            countOfFreePlaces--;
        }
    }

    public  boolean isFreePlaces () {
        return countOfFreePlaces > 0;
    }

    public Parking(int countOfPlaces) {
        this.countOfPlaces = countOfPlaces;
        countOfFreePlaces = countOfPlaces;
    }

    public synchronized int getCountOfPlaces() {
        return countOfPlaces;
    }

    public synchronized void setCountOfPlaces(int countOfPlaces) {
        this.countOfPlaces = countOfPlaces;
    }
}
