package com.company.lection9collections;

import java.util.*;

public class ClassWork3 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList <>();
        for (int i = 0; i <= 10; i++) {
            nums.add((int) (Math.random() * 11));
        }
        for (Integer integer: nums) {

            System.out.println(integer);

        }
        int a = nums.size();
        System.out.println("Новый массив");
//        for (int i = 0; i < nums.size(); i++) {
//            for (int j = 1; j < a; j++) {
//                if (nums.get(i) == nums.get(j)) {
//                    nums.remove(j);
//                    a--;
//                }
//            }
//        }
//        Collection <Integer> nums1 = new HashSet <Integer>();
//        nums1.addAll(nums);
        for (Integer integer: nums) {
            System.out.println(integer);
        }

    }
}
