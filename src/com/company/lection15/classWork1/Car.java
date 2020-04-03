package com.company.lection15.classWork1;

import java.io.Serializable;

public class Car implements Serializable {
    public int speed;
    public int powerOfEngine;
    public int weight;
    public long serialVersionUID;

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", powerOfEngine=" + powerOfEngine +
                ", weight=" + weight +
                '}';
    }
}
