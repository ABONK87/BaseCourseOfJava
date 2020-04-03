package com.company.lection4Array;

import java.util.Random;

public class ClassWork1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        String[] arr1 = new String[9];
        char[] arr2 = new char[10];
        int[] arr3 = {1, 2, 3, 5, 9};
        Random rand = new Random();//рандомное число
        int x = rand.nextInt(10);
        for (int element:arr3) { //цикл foreach для массива
            System.out.println(element);
        }

    }
}
