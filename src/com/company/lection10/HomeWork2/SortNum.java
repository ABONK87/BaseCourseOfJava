package com.company.lection10.HomeWork2;

import java.util.Comparator;

public class SortNum implements Comparator<Integer> {
    public int compare (Integer x, Integer y) {
        return x.compareTo(y);
    }
}
