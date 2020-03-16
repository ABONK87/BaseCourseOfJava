package baseCourseOfJava.lection10.HomeWork2;

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
