package com.company.lection5strings;

public class HomeWork3 {
    public static void main(String[] args) {//Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов. 
        String str = "  Зима без, cнега! И мороза and";
        String str1 = str.trim();
        int num = 0;
        StringBuilder str2 = new StringBuilder();
        for (int i = 1; i < str1.length(); i++) {
            if (i == str1.length() - 1 && str1.charAt(i) >= 65) {
                str2.append(str1.charAt(i));
            }
            else {
                if (str1.charAt(i) >= 65 && str1.charAt(i + 1) < 65){
                    str2.append(str1.charAt(i));
                }
            }

        }
        System.out.println(str2.toString().toLowerCase());
    }
}
