package baseCourseOfJava.lection7interface.HomeWork1;

import baseCourseOfJava.lection7interface.HomeWork1.Equipment.Equipment;

public class Laptop extends Equipment {
    public Laptop() {
    }

    public Laptop(int power) {
        super(power);
    }

    public void turnOnInSocket() {
        System.out.println("Ноутбук включился");
    }
}
