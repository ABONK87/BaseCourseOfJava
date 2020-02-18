package baseCourseOfJava.lection4Array;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3 {//3. Найти максимальный элемент(ы) в матрице и удалить из матрицы все строки и столбцы, его содержащие
    public static void main(String[] args) {
        System.out.println("Введите размер матрицы:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [][] arr = new int [a][a];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int c = (int) (Math.random() * 10);
                arr [i][j] = c;
            }
        }
        int maxNum = arr[0][0];
        int maxX = 0;//позиция максимального числа
        int maxY = 0;
        for (int i = 0; i < arr.length; i++) {//поиск максимального числа в матрице
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > maxNum) {
                    maxNum = arr[i][j];
                    maxX = i;
                    maxY = j;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {//вывод массива
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        int arr1 [][] = new int[a-1][a-1];
        for (int i = 0; i < arr1.length; i++) {
            if (i < maxX) {
                for (int j = 0; j < arr1[i].length; j++) {
                    if (j < maxY) {
                        arr1[i][j] = arr[i][j];
                    }
                    else {
                        arr1[i][j] = arr[i][j + 1];
                    }
                }
            }
            else {
                for (int j = 0; j < arr1[i].length; j++) {
                    if (j < maxY) {
                        arr1[i][j] = arr[i + 1][j];
                    }
                    else {
                        arr1[i][j] = arr[i + 1][j + 1];
                    }
                }
            }
        }
        System.out.println("Матрица после удаления столбца и строки, в которой находился максимальный элемент");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
