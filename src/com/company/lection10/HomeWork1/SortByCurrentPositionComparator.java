package com.company.lection10.HomeWork1;

import java.util.Comparator;

public class SortByCurrentPositionComparator implements Comparator<Car> {

    public int compare (Car c1, Car c2) {
        return Integer.compare(c1.getCurrentPosition(), c2.getCurrentPosition());
    }
}
