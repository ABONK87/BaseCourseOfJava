package com.company.lection9collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClassWork2 {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<Integer>();
        for (int i = 0; i < 1000; i++) {
            num.add((int) (Math.random() * 11));
        }
        Iterator <Integer> iterator = num.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() <= 3) {
                iterator.remove();
            }
        }
        for (Integer integer : num) {
            System.out.println(integer);
        }
//        for (int i = 0; i < num.size(); i++) {
//            if (num.get(i) <= 3) {
//                num.remove(i);
//            }
//            else {
//                System.out.println(iterator.next());
//            }
//        }
    }
}
