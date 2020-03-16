package baseCourseOfJava.lection10.HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class Car {

    private int id, speed, startingPosition, currentPosition, numOfCars;

    public Car() {
    }

    public Car (int id) {

        System.out.printf("Введите скорость %d машины:\n", id);
        int speed = new Scanner(System.in).nextInt();
        this.speed = speed;
        System.out.printf("Введите начальную позицию %d машины:\n", id);
        int startingPosition = new Scanner(System.in).nextInt();
        this.id = id;
        currentPosition = startingPosition;
    }




    public void run() {
        currentPosition = currentPosition + speed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStartingPosition() {
        return startingPosition;
    }

    public void setStartingPosition(int startingPosition) {
        this.startingPosition = startingPosition;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id &&
                speed == car.speed &&
                startingPosition == car.startingPosition &&
                currentPosition == car.currentPosition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, speed, startingPosition, currentPosition);
    }
}
