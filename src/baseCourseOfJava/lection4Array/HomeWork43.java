package baseCourseOfJava.lection4Array;

import java.util.Scanner;

public class HomeWork43 {
    public static void main(String[] args) {//Повернуть матрицу на 270 градусов против часовой стрелки
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

        for (int i = 0; i < arr.length; i++) {//вывод матрицы
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = i; j < arr[i].length - 1 - i; j++) {
                tmp = arr[i][j];
                arr[i][j] = arr[arr.length - 1 - j][i];
                arr[arr.length - 1 - j][i] = arr[arr.length - 1 - i][arr.length - 1 - j];
                arr[arr.length - 1 - i][arr.length - 1 - j] = arr[j][arr.length - 1 - i];
                arr[j][arr.length - 1 - i] = tmp;
            }
        }
        System.out.println("Перевернутая матрица");
        for (int i = 0; i < arr.length; i++) {//вывод перевернутой матрицы
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
