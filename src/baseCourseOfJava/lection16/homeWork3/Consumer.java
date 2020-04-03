package baseCourseOfJava.lection16.homeWork3;

public class Consumer extends Thread {
    private Store store;

    public void run () {
        while (true){
            store.get();
        }
    }

    public Consumer(Store store) {
        this.store = store;
    }
}
