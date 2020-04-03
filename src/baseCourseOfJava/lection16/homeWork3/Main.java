package baseCourseOfJava.lection16.homeWork3;

public class Main {
    public static void main(String[] args) {
        Store store = new Store(8);
        new Producer(store).start();
        new Consumer(store).start();
    }
}
