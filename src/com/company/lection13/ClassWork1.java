package com.company.lection13;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ClassWork1 {

    public static void main(String[] args) {

        int k = 5;
        int [] nums = {1, 2, 3, 5, 5, 6, 7, 8, 9};
        List<Integer> nums1 = new ArrayList<>();
        for (int num : nums) {
            if (num == k) {
                continue;
            }
            nums1.add(num);
        }

        nums1.forEach(System.out::println);

    }



}
