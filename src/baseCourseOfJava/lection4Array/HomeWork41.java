package baseCourseOfJava.lection4Array;

import java.util.Scanner;

public class HomeWork41 {
    public static void main(String[] args) {//Повернуть матрицу на 90 градусов против часовой стрелки
        System.out.println("Введите размер матрицы:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [][] arr = new int [a][a];
        int [][] arr1 = new int [a][a];
        for (int i = 0; i < arr.length; i++) {//заполнение матрицы случайными числами
            for (int j = 0; j < arr[i].length; j++) {
                int c = (int) (Math.random() * 10);
                arr [i][j] = c;
            }
        }
        for (int i = 0; i < arr.length; i++) {//вывод матрицы
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr1[a - j - 1][i] = arr[i][j];
            }
        }
        System.out.println("Перевернутая матрица");
        for (int i = 0; i < arr1.length; i++) {//вывод матрицы
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
