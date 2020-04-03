package com.company.lection16.classWork1;

public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking(3);
        Car car1 = new Car("car1", parking, 5000, 10000);
        Car car2 = new Car("car2", parking, 10000, 1000);
        Car car3 = new Car("car3", parking, 9000, 900);
        Car car4 = new Car("car4", parking, 5000, 5000);
        Car car5 = new Car("car5", parking, 5000, 8000);
        car1.start();
        car2.start();
        car3.start();
        car4.start();
        car5.start();
    }
}
