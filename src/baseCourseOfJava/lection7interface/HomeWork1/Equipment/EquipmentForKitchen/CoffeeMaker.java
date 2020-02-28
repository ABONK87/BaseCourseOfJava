package baseCourseOfJava.lection7interface.HomeWork1.Equipment.EquipmentForKitchen;

import baseCourseOfJava.lection7interface.HomeWork1.Equipment.DoAble;

public class CoffeeMaker extends EquipmentForKitchen {

    public void turnOnInSocket() {
        System.out.println("Кофемашина включилась");
    }

    public void toCook() {
        System.out.println("Готовлю кофе");
    }

    public void toDo() {
        System.out.println("Делаю вкусный кофе");
    }
}
