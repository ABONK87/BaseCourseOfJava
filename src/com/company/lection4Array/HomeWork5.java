package com.company.lection4Array;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {//Найти и вывести наибольшее число возрастающих элементов матрицы, идущих подряд
        System.out.println("Введите размер матрицы:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [][] arr = new int [a][a];
        int pos2x = 0;
        int pos2y = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {//заполнение матрицы случайными числами
            for (int j = 0; j < arr[i].length; j++) {
                int c = (int) (Math.random() * 100);
                arr [i][j] = c;
            }
        }
        for (int[] ints : arr) {//вывод матрицы
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println("");
        }
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                if (arr[i][j + 1] > arr[i][j]){
                    k++;
                }
                if (k > count) {
                    count = k + 1;
                    pos2x = j + 1;
                    pos2y = i;
                }
                if (arr[i][j + 1] <= arr[i][j]) {
                    k = 0;
                }
            }
        }
        for (int i = pos2x - count + 1; i <= pos2x; i++) {//вывод возрастающей последовательности
            System.out.print(arr[pos2y][i] + " ");
        }

    }
}
