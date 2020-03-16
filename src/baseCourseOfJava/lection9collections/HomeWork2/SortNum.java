package baseCourseOfJava.lection9collections.HomeWork2;

import baseCourseOfJava.lection9collections.HomeWork1.Car;

import java.util.Comparator;

public class SortNum implements Comparator<Integer> {
    public int compare (Integer x, Integer y) {
        if (x == y) {
            return 0;
        }
        if (x > y) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
