package baseCourseOfJava.lection9collections.HomeWork1;

import java.util.ArrayList;
import java.util.Comparator;

public class SortByCurrentPositionComparator implements Comparator<Car> {

    public int compare (Car c1, Car c2) {
        if (c1.getCurrentPosition() == c2.getCurrentPosition()) {
            return 0;
        }
        if (c1.getCurrentPosition() > c2.getCurrentPosition()) {
            return 1;
        }
        else {
            return -1;
        }
    }


}
