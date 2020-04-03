package com.company.lection3Cycles.classWork;

public class Task3 {
    public static void main(String[] args) {
        //задача есть сумма в рублях. вывести это число со словом рубей в правильном падеже
        int money = 1254;
        int lastNum = money % 10;
        if (lastNum == 1) {
            System.out.println(money + " рубль");
        }
        else if (lastNum > 2 && lastNum < 5){
            System.out.println(money + " рубля");
        }
        else if (lastNum > 4 || lastNum == 0){
            System.out.println(money + " рублей");
        }
    }
}
