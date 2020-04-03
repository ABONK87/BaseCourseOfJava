package com.company.lection3Cycles.classWork;

public class Task1 {
    public static void main(String[] args) {
        //заканчивается ли число на 7
        double x = 0.0000000657;

        if (x < 1) {
            while (x < 1) {
                x = x * 10;
            }
        }
        double l = x % 10;
        if (l == 7) {
            System.out.println("Последняя цифра является семеркой");
        }
        else {
            System.out.println("Последняя цифра не является семеркой");
        }
    }
}
