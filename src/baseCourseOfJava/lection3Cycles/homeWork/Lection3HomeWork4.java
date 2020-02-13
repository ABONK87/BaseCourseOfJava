package baseCourseOfJava.lection3Cycles.homeWork;

public class Lection3HomeWork4 {
    public static void main(String[] args) {
        //Найдите и выведите в консоль простые числа до 10000, с использованием двух вложенных циклов for
        System.out.println("Простые числа от 1 до 10000:");
        for (int i = 1; i <= 10000; i++) {
            int count = 0; //счетчик на сколько чисел делится
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count <= 2) {
                System.out.println(i);
            }

        }
    }
}
