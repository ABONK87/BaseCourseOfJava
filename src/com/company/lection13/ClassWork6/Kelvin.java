package com.company.lection13.ClassWork6;

public class Kelvin extends com.company.lection13.ClassWork6.Temperature {
    int t;

    public Kelvin(int t, int t1) {
        super(t);
        this.t = t1;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }
}
