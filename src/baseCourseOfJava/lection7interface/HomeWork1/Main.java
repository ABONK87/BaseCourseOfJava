package baseCourseOfJava.lection7interface.HomeWork1;

import baseCourseOfJava.lection7interface.HomeWork1.Equipment.Cookable;
import baseCourseOfJava.lection7interface.HomeWork1.Equipment.DoAble;
import baseCourseOfJava.lection7interface.HomeWork1.Equipment.Equipment;
import baseCourseOfJava.lection7interface.HomeWork1.Equipment.EquipmentForKitchen.CoffeeMaker;
import baseCourseOfJava.lection7interface.HomeWork1.Equipment.EquipmentForKitchen.Fridge;

public class Main {
    private static Object Turnible;

    public static void main(String[] args) {
        Equipment laptop = new Laptop(100);
        laptop.turnOnInSocket();
        laptop = new Fridge();
        laptop.turnOnInSocket();
        laptop = new Equipment();
        laptop.turnOnInSocket();
        DoAble coffee = new CoffeeMaker();
        coffee.toDo();

    }
}
