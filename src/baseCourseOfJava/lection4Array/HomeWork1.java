package baseCourseOfJava.lection4Array;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {//Упорядочить и вывести числа в порядке возрастания значений их длины
        System.out.println("Введите размер массива:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int [] arr = new int [x];
        System.out.println("Введите содержимое массива:");
        for (int i = 0; i < arr.length; i++) {
            int c = sc.nextInt();
            arr [i] = c;
        }
        int [] razArr = new int[x];
        int maxRaz = 1;//максимальная размерность числа в массиве
        for (int i = 0; i < arr.length; i++) {//считаем размерность, делаем массив размерностей
            int raz = 0;
            int a = arr[i];
            while (a >= 1) {
                a /= 10;
                raz++;
                razArr[i] = raz;
            }
            if (raz > maxRaz) {//ищем максимальную размерность
                maxRaz = raz;
            }
        }
        for (int i = 1; i <= maxRaz; i++) {//проходим от единичной размерности до максимальной
            for (int j = 0; j < razArr.length; j++) {//проходим по массиву чисел
                if (razArr[j] == i) {
                    System.out.print(arr[j] + " ");//выводим числа по возрастанию размерности
                }
            }
        }
    }
}
