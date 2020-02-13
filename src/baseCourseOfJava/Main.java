package baseCourseOfJava;

public class Main {

    public static void main(String[] args) {
        int num = 2580652;
        int x = num;
        int k = 0;
        while (x > 1) {
            x /= 10;
            k++;
        }
        System.out.println(k);
        int m = num;
        int l = 0;
        l = k / 3;
        for (int i = l; i > 0; i--) {
            System.out.print((int) (num / Math.pow(1000, i)) + " ");

        }


        //является ли число простым

//        int x = 33;
//        if (x % 2 == 0 || x % 3 == 0 || x % 5 == 0 || x % 7 == 0) {
//            System.out.println("Число не является простым");
//        }
//        else {
//            System.out.println("Число является простым");
//        }
//        int i = 0;
//        int sum = 0;
//        while (i < 20) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//            i++;
//        }
//        System.out.println(sum);
//        double x = 0.0000000657;
//
//        if (x < 1) {
//            while (x < 1) {
//                x = x * 10;
//            }
//        }
//        double l = x % 10;
//        if (l == 7) {
//            System.out.println("Последняя цифра является семеркой");
//        }
//        else {
//            System.out.println("Последняя цифра не является семеркой");
//        }
//        double a = 9;
//        double b = 5;
//        int r = 5;
//        double gip = (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
//        if ((gip / 2) > r) {
//            System.out.println("Круг закроет это отверстие");
//        }
//        else {
//            System.out.println("Круг не закроет отверстие");
//        }
        //задача есть сумма в рублях. вывести это число со словом рубей в правильном падеже
//        int money = 1254;
//        int lastNum = money % 10;
//        if (lastNum == 1) {
//            System.out.println(money + " рубль");
//        }
//        else if (lastNum > 2 && lastNum < 5){
//            System.out.println(money + " рубля");
//        }
//        else if (lastNum > 4 || lastNum == 0){
//            System.out.println(money + " рублей");
//        }
        //задача вывести дату следующего дня
//        int day = 31;
//        int month = 12;
//        int year = 2019;
//        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day == 31)) {
//            day = 1;
//            if (month == 12) {
//                month = 1;
//                year += 1;
//            }
//            else {
//                month += 1;
//            }
//        }
//        else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day == 30)) {
//            day = 1;
//            month += 1;
//        }
//        else if (month == 2 && day == 28) {
//            day = 1;
//            month += 1;
//        }
//        else {
//            day += 1;
//            month += 1;
//        }
//
//        System.out.println(day + "." + month + "." + year);
    }
}

