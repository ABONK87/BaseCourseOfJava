package com.company.lection15.classWork4;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1000);
        Building building = new Building(10000);
        Worker worker1 = new Worker(1, car, building);
        Worker worker2 = new Worker(2, car, building);
        Worker worker3 = new Worker(3, car, building);
        worker1.start();
    }
}
