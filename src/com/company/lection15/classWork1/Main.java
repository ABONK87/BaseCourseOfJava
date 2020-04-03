package com.company.lection15.classWork1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Car car = new Car();
//        car.speed = 15;
//        car.powerOfEngine = 1000;
//        car.weight = 1200;
//
//        FileOutputStream fos = new FileOutputStream("t.txt");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(car);
//        oos.close();
        FileInputStream fis = new FileInputStream("t.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Car i = (Car) ois.readObject();
        System.out.println(car.toString());

        ois.close();
    }
}
