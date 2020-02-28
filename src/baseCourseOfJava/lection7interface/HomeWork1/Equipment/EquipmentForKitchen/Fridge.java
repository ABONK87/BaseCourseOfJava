package baseCourseOfJava.lection7interface.HomeWork1.Equipment.EquipmentForKitchen;

import baseCourseOfJava.lection7interface.HomeWork1.Equipment.Equipment;

public class Fridge extends EquipmentForKitchen {
    public Fridge() {
    }

    public void turnOnInSocket() {
        System.out.println("Холодильник включился");
    }
    public void toDo() {
        System.out.println("Храню продукты");
    }
}
