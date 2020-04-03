package com.company.lection9collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClassWork2 {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            num.add((int) (Math.random() * 11));
        }
        num.removeIf(integer -> integer <= 3);
        for (Integer integer : num) {
            System.out.println(integer);
        }
    }
}
