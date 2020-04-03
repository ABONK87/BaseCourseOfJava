package com.company.lection16.classWork1;

public class Car extends Thread{

    private String name;
    private Parking parking;
    private int timeOfWaiting;
    private int timeOfParking;

    @Override
    public void run() {
        new SetParkingPlace(this, parking);
        if (parking.isFreePlaces()) {
            parking.setFreePlaces(this);
            System.out.println("Машина " + name +  " припарковалась");
            try {
                sleep(timeOfParking);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Машина " + name +  " уехала");
        }
//        else if ()
        else {
            System.out.println("Свободных мест нет");

            System.out.println("Я поехал на другую стоянку");
        }
    }

    public Car(String name, Parking parking, int timeOfWaiting, int timeOfParking) {
        this.name = name;
        this.parking = parking;
        this.timeOfWaiting = timeOfWaiting;
        this.timeOfParking = timeOfParking;
    }


    public Parking getParking() {
        return parking;
    }

    public void setParking(Parking parking) {
        this.parking = parking;
    }

    public int getTimeOfWaiting() {
        return timeOfWaiting;
    }

    public void setTimeOfWaiting(int timeOfWaiting) {
        this.timeOfWaiting = timeOfWaiting;
    }

    public int getTimeOfParking() {
        return timeOfParking;
    }

    public void setTimeOfParking(int timeOfParking) {
        this.timeOfParking = timeOfParking;
    }
}
