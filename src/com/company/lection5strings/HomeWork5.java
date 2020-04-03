package com.company.lection5strings;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {//Постройте частотный словарь букв русского алфавита по тексту.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String str = sc.nextLine();
        String str1 = str.toLowerCase();
        int count = 0;
        for (int i = 1072; i <= 1105; i++) {
            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) == i) {
                    count++;
                }
            }
            if (count > 0) {
                double percent = (double) count / str1.length() * 100;
                System.out.printf("Буква " + "\"" + ((char) i) + "\"" + " встречается %d раз или %f", count, percent);
                System.out.print("%");
                System.out.println("");
                count = 0;
            }
        }
    }
}
