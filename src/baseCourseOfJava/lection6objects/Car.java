package BaseCourseOfJava.lection6objects;

import javax.sound.midi.Soundbank;

public class Car {
    long speed;
    void run () {
        System.out.println("speed: " + speed);
    }

    public Car() {
        System.out.println("init car");
    }
    public Car(int x) {
        this.x = x;
        System.out.println("init car " + x);
    }

    public Car(int x, int y) {
        this.x = x;
        this.y = y;

        System.out.println("init car " + x + " " + y);
    }
    public Car(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("init car " + x + " " + y + " " + z);
    }

    private int x;
    private int y;
    private int z;

    public int sum (int x, int y) {
        return x + y;
    }
    public String sum (String x, String y) {
        return x + y;
    }

    public static void main(String[] args) {
//        Car bmw = new Car();
//        bmw.speed = 10;
//        bmw.run();
//
//        Car bmw1 = new Car();
//        bmw1.speed = 1000;
//        bmw1.run();
//        System.out.println(bmw.sum(5, 6));
//        System.out.println(bmw.sum("ab", "bc"));
        Car car1 = new Car();
        Car car2 = new Car(1);
        Car car3 = new Car(1, 2);
        Car car4 = new Car(1,2,3);

    }
}
