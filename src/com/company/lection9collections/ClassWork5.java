package com.company.lection9collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ClassWork5 {


    public static Set<Integer> s = new HashSet<>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            s.add(i);
        }
        for (Integer integer : s) {
            System.out.println(integer);
        }
        Iterator <Integer> iterator1 = s.iterator();
        Integer a;
        while (iterator1.hasNext()) {
            a = iterator1.next();
            if (a > 4) {
                iterator1.remove();
            }
        }
        for (Integer integer : s) {
            System.out.println(integer);
        }
        System.out.println(s);
    }


}
