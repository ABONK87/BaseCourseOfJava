package com.company.lection4Array;

import java.util.Scanner;

public class HomeWork41 {
    public static void main(String[] args) {//Повернуть матрицу на 90 градусов против часовой стрелки
        System.out.println("Введите размер матрицы:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [][] arr = new int [a][a];
        int tmp;
        for (int i = 0; i < arr.length; i++) {//заполнение матрицы случайными числами
            for (int j = 0; j < arr[i].length; j++) {
                int c = (int) (Math.random() * 10);
                arr [i][j] = c;
            }
        }
        for (int[] ints : arr) {//вывод матрицы
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = i; j < arr[i].length - 1 - i; j++) {
                tmp = arr[i][j];
                arr[i][j] = arr[j][a - 1 - i];
                arr[j][a - 1 - i] = arr[a - 1 - i][a - 1 - j];
                arr[a - 1 - i][a - 1 - j] = arr[a - 1 - j][i];
                arr[a - 1 - j][i] = tmp;
            }
        }
        System.out.println("Перевернутая матрица");
        for (int[] ints : arr) {//вывод перевернутой матрицы
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println("");
        }
    }
}
