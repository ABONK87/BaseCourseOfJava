package com.company.lection6objects.HomeWork1;

public class Main {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(83720);
        Time t3 = new Time(23, 15, 20);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        t1.getTime();
        t2.getTime();
        t3.getTime();
        System.out.println(t1.compareTime(10));
        System.out.println(t1.compareTime(t2));
        System.out.println(t2.compareTime(83720));
        System.out.println(t2.compareTime(t3));

    }
}
