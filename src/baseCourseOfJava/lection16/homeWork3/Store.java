package baseCourseOfJava.lection16.homeWork3;

import static java.lang.Thread.sleep;

public class Store {
    private int countOfProducts = 0;
    private int maxCountOfProducts;

    public Store(int maxCountOfProducts) {
        this.maxCountOfProducts = maxCountOfProducts;
    }

    public void put () {
        synchronized (this) {
            if (countOfProducts == maxCountOfProducts){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countOfProducts++;
                    System.out.println("Произведен 1 товар");
                    System.out.println("Товаров в магазине: " + countOfProducts);
                notify();
        }
    }

    public void get () {
        synchronized (this) {
            if (countOfProducts == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countOfProducts--;
                System.out.println("Куплен 1 товар");
                System.out.println("Товаров в магазине: " + countOfProducts);
            notify();
        }
    }
}