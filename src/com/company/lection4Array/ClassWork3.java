package com.company.lection4Array;

import java.util.Arrays;
import java.util.Random;

public class ClassWork3 {
    public static void main(String[] args) {
        int[] num = new int[1000];
        Random rand = new Random();
        int max = num[0];
        int min = num[0];
        int maxPos = 0;
        int minPos = 0;
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(50);
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
                maxPos = i;
            }
            if (num[i] < min) {
                min = num[i];
                minPos = i;
            }
        }
        if (minPos < maxPos) {
            for (int i = minPos + 1; i < maxPos; i++) {
                sum = sum + num[i];
            }
        }
        else {
            for (int i = maxPos + 1; i < minPos; i++) {
                sum = sum + num[i];
            }
        }
        System.out.println(Arrays.toString(num));
        System.out.println(sum);
    }
}
