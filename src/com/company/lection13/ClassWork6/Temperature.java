package com.company.lection13.ClassWork6;

import java.util.Objects;

public class Temperature {
    int t;

    public Temperature(int t) {
        this.t = t;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return t == that.t;
    }

    @Override
    public int hashCode() {
        return Objects.hash(t);
    }
}
