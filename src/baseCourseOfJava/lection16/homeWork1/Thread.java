package baseCourseOfJava.lection16.homeWork1;

public class Thread extends java.lang.Thread {
    private String name;

    public void run () {
        System.out.println("Поток запущен. Состояние: " + this.getState());
    }

    public Thread(String name) {
        super(name);
    }
}
