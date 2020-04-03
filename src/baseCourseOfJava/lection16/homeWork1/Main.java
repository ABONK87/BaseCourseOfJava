package baseCourseOfJava.lection16.homeWork1;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread("Поток 1");
        System.out.println("Поток создан. Состояние: " + thread.getState());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Поток отработал. Состояние: " + thread.getState());
    }
}
