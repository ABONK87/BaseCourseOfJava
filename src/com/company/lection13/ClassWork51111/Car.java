package com.company.lection13.ClassWork51111;

public class Car implements Move{
    private Engine engine;
    private int powerOfEngine;
    private int maxSpeed;
    private boolean offRoad;
    private int carrying;
    private int sizeOfWheel;
    private int numsOfWheel;

    @Override
    public void move() {

    }


    class Wheel {
        int numsOfWheels;

        public Wheel(int numsOfWheels) {
            this.numsOfWheels = numsOfWheels;
        }

        public int getNumsOfWheels() {
            return numsOfWheels;
        }

        public void setNumsOfWheels(int numsOfWheels) {
            this.numsOfWheels = numsOfWheels;
        }
    }

    public Car(Engine engine, int powerOfEngine, int maxSpeed, boolean offRoad, int carrying, int sizeOfWheel, int numsOfWheel) {
        this.engine = engine;
        this.powerOfEngine = powerOfEngine;
        this.maxSpeed = maxSpeed;
        this.offRoad = offRoad;
        this.carrying = carrying;
        this.sizeOfWheel = sizeOfWheel;
        new Wheel(numsOfWheel);
    }

    public void Move () {
        System.out.println("Car is moving");
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getPowerOfEngine() {
        return powerOfEngine;
    }

    public void setPowerOfEngine(int powerOfEngine) {
        this.powerOfEngine = powerOfEngine;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isOffRoad() {
        return offRoad;
    }

    public void setOffRoad(boolean offRoad) {
        this.offRoad = offRoad;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    public int getSizeOfWheel() {
        return sizeOfWheel;
    }

    public void setSizeOfWheel(int sizeOfWheel) {
        this.sizeOfWheel = sizeOfWheel;
    }
}
