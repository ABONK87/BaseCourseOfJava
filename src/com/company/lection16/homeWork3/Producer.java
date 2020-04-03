package com.company.lection16.homeWork3;

public class Producer extends Thread {

    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    public void run () {
        while (true){
            store.put();
        }
    }
}
