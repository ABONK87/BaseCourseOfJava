package com.company.lection9collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClassWork4 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            marks.add((int) (Math.random() * 11));
        }
        for (Integer i: marks) {
            System.out.println(i);
        }
        int max = marks.get(0);
        Iterator <Integer> iterator = marks.iterator();
        Integer a;
        while (iterator.hasNext()) {
            if ((a = iterator.next()) > max) {
                max = a;
            }
        }
        System.out.println("Максимальная отметка: " + max);
    }
}
