package baseCourseOfJava.lection9collections.HomeWork2;

import java.util.Scanner;

public class Loop {
    public void loop() {
        BlackBox blackBox = new BlackBox();
        while (true) {
            System.out.println("1. Добавить число");
            System.out.println("2. Вывести к-ое по минимальности");
            System.out.println("3. Распечатать все числа");
            System.out.println("4. Выход");
            int x = new Scanner(System.in).nextInt();
            if (x == 1) {
                System.out.println("Введите число");
                int y = new Scanner(System.in).nextInt();
                blackBox.add(y);
                System.out.printf("Вы добавили число: %d\n", y);
            }
            else if (x == 2) {
                System.out.println("Введите позицию к");
                int k = new Scanner(System.in).nextInt();
                System.out.printf("K-oe по минимальности число: %d\n", blackBox.getMin(k));
            }
            else if (x == 3) {
                blackBox.print();
            }
            else if (x == 4) {
                System.out.println("Пока!");
                System.exit(0);
            }
            else {
                System.out.println("Я вас не понимаю!");
            }
        }
    }
}
