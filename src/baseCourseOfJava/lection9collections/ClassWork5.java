package com.company.lection9collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ClassWork5 {


    public static Set<Integer> s = new HashSet<Integer>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            s.add(i);
        }
        Iterator <Integer> iterator = s.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Iterator <Integer> iterator1 = s.iterator();
        Integer a;
        while (iterator1.hasNext()) {
            a = iterator1.next();
            if (a > 4) {
                iterator1.remove();
            }
        }
        Iterator <Integer> iterator2 = s.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        System.out.println(s);
    }


}
