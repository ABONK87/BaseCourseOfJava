package com.company.lection3Cycles.homeWork;

public class Task1 {
    public static void main(String[] args) {
        int num = 111580652;
        int x = num;
        int k = 0;
        int l;
        while (x >= 1) {
            x /= 10;
            k++; // число разрядов в числе
        }
        System.out.println(k);
        l = k / 3;
        int i;
        if (k % 3 == 0) {
            for (i = l - 1; i > 0; i--) {
                System.out.print((int) (num / Math.pow(1000, i)) + " ");
            }
            if (i == 0) {
                System.out.print(num % 1000);
            }
        }
        else {
            System.out.print((int) (num / Math.pow(10, (l * 3))));
            for (i = l - 1; i > 0; i--) {
                System.out.print((int) (num / Math.pow(1000, i)) + " ");
            }

        }


    }
}
