package com.company.lection4Array;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {//Округлить все элементы матрицы до целого числа
        System.out.println("Введите размер матрицы:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double [][] arr = new double [x][x];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                double c = Math.random() * 10;
                arr [i][j] = c;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr [i][j] = Math.round(arr [i][j]);
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
