package com.company.lection13;

public class ClassWork2 {
    public static void main(String[] args) {

        int tmp;
        int [] nums = {10, 21, 30, 5, 50, 16, 17, 89, 19};
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
            }

            }
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }

}
