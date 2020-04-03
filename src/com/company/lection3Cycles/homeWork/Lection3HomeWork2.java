package com.company.lection3Cycles.homeWork;

public class Lection3HomeWork2 {
    public static void main(String[] args) {
//                Имеется целое число,
//                следует вывести его в бухгалтерском формате.
//                Т.е.начиная справа каждые три позиции отделяются пробелом.
//                Например число 20023143 должно быть выведено как 20 023 143
        int num = 2_123_354_698;//нижнее подчеркивание просто для удобства
        double count = 0;//счётчик количества цифр в числе
        int x = num;

        while (x >= 1) {//считаем количество цифр
            count++;
            x /= 10;
        }
        x = num;
        double l = count / 3;
        int m;
        int n;
        System.out.println(count);
        if (l % 3 == 0) {//если количество цифр кратно 3 выводим три цифры и разделяем пробелом
            for (int i = (int) l - 1; i >= 1; i--) {
                n = (int)(Math.pow(1000, i));
                m = x / n;
                System.out.print(m + " ");
                x -= m*(int)(Math.pow(1000, i));
            }
        }
        else {//если количество цифр не кратно 3, берем первые числа отделяем пробелом и дальше по 3 числа
            for (int i = (int) (count - 1); i >= (int) l * 3; i--) {
                n = (int)(Math.pow(10, i));
                m = x / n;
                System.out.print(m);
                x -= m*(int)(Math.pow(10, i));
            }
            System.out.print(" ");
            for (int i = (int) l - 1; i >= 1; i--) {
                n = (int)(Math.pow(1000, i));
                m = x / n;
                System.out.print(m + " ");
                x -= m*(int)(Math.pow(1000, i));
            }
        }
        System.out.print(x);
    }
}
