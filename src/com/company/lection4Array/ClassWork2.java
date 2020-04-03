package com.company.lection4Array;

import java.util.Arrays;
import java.util.Random;

public class ClassWork2 {
    public static void main(String[] args) {
        int [] num = new int[10];
        Random rand = new Random();
        int maxNum = num[0];
        int pos = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(10);
        }
        for (int i = 1; i < num.length; i++) {
            if (num[i] > maxNum) {
                maxNum = num[i];
                pos = i;
            }
        }
        System.out.println(Arrays.toString(num));
        System.out.printf("Максимальная отметка %d. Позиция %d", maxNum, pos);

    }
}
