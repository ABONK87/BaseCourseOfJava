package com.company.lection16.homeWork2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество потоков");
        int countOfThreads = new Scanner(System.in).nextInt();
        ManagePrintThreads managePrintThreads = new ManagePrintThreads();
        managePrintThreads.addThread(managePrintThreads.createThreads(countOfThreads));
        managePrintThreads.startThreads(managePrintThreads.getThreads());
    }
}
