package com.company.lection3Cycles.homeWork;

public class Lection3HomeWork3 {
    public static void main(String[] args) {
//                Имеются числа x и y,
//                y больше x, увеличивать x на единицу,
//                пока x не будет равен или больше y
        int x = 1;
        int y = 20;
        for (; x <= y; x++) {
            System.out.print("x = " + x + " ");
            System.out.println("y = " + y);
        }
    }
}
