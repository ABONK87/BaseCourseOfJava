package com.company.lection13.ClassWork5;

import java.util.Objects;

public class SolidOfRevolution extends Shape{
    double radius;

    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SolidOfRevolution that = (SolidOfRevolution) o;
        return Double.compare(that.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }

    @Override
    public String toString() {
        return "SolidOfRevolution{" +
                "radius=" + radius +
                '}';
    }
}
