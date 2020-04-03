package com.company.lection15.classWork3;

public class FirstThread extends Thread{
    public void run () {
        for (int i = 0; i< 10; i++) {
            System.out.println("Я работаю");
            try {
                Thread.sleep(700);
            }
            catch (InterruptedException e) {
                System.err.print(e);
            }
        }
    }

    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();
        firstThread.start();
        SecondThread secondThread = new SecondThread();
        new Thread(secondThread).start();
    }
}
