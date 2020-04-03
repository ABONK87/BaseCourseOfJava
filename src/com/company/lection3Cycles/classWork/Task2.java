package com.company.lection3Cycles.classWork;

public class Task2 {
    public static void main(String[] args) {
        //задача есть прямоугольное отверстие и круг радиуса. узнать закроет ли круг отверстие
        double a = 9;
        double b = 5;
        int r = 5;
        double gip = (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
        if ((gip / 2) > r) {
            System.out.println("Круг закроет это отверстие");
        }
        else {
            System.out.println("Круг не закроет отверстие");
        }
    }
}
