package com.company.lection10.HomeWork1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите длинну трасы:");
        Track track = new Track(new Scanner(System.in).nextInt());
        System.out.println("Введите количество машин:");
        int numOfCar = new Scanner(System.in).nextInt();
        List<Car> cars = new InitCar().init(numOfCar);
        SortByCurrentPositionComparator sortByCurrentPosition = new SortByCurrentPositionComparator();
        while (track.getFinishing() < numOfCar) {
            cars.sort(sortByCurrentPosition);
            for (Car c: cars) {
                c.run();
            }
            track.print(cars);
            track.finishing(cars);
        }
    }
}
