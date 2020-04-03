package com.company.lection15.classWork4;

public class Worker extends Thread{
    private int power;
    private Car car;
    private Building building;

    public void run() {
        car.setCountOfBox(car.getCountOfBox() - power);
        building.setCountOfBox(building.getCountOfBox() + power);

    }

    public Worker(int power, Car car, Building building) {
        this.power = power;
        this.car = car;
        this.building = building;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }


}
