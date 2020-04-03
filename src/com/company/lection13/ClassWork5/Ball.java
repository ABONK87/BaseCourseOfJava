package com.company.lection13.ClassWork5;

import java.util.Objects;

public class Ball extends com.company.lection13.ClassWork5.SolidOfRevolution {
    private double volume;

    public Ball(double volume, double radius, double volume1) {
        super(volume, radius);
        this.volume = volume1;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ball ball = (Ball) o;
        return Double.compare(ball.volume, volume) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), volume);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "volume=" + volume +
                ", radius=" + radius +
                '}';
    }
}
