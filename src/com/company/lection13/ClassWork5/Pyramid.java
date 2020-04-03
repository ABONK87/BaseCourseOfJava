package com.company.lection13.ClassWork5;

import java.util.Objects;

public class Pyramid extends Shape{
    private double s;
    private double h;

    public Pyramid(double volume, double s, double h) {
        super(volume);
        this.s = s;
        this.h = h;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pyramid pyramid = (Pyramid) o;
        return Double.compare(pyramid.s, s) == 0 &&
                Double.compare(pyramid.h, h) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), s, h);
    }

    @Override
    public String toString() {
        return "Pyramid{" +
                "s=" + s +
                ", h=" + h +
                '}';
    }
}
