package com.company.lection10.HomeWork1;

import java.util.ArrayList;
import java.util.List;

public class InitCar {

    public ArrayList<Car> init (int numOfCar) {
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 1; i <= numOfCar; i++) {
            cars.add(new Car(i));
        }
        return cars;
    }
}
