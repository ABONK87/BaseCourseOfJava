package com.company.lection13.ClassWork5;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(1000);
        Cylinder c = new Cylinder(500, 20, 35);
        Cylinder c1 = new Cylinder(500, 20, 35);
        Cylinder c2 = new Cylinder(500, 20, 35);
        System.out.println(box.add(c));
        System.out.println(box.add(c1));
        System.out.println(box.add(c2));
    }
}
