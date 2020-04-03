package com.company.lection13.ClassWork5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Box extends Shape {
    List<Shape> shape = new ArrayList<>();

    public boolean add (Shape sh) {
        if ((getVolume() - sh.getVolume()) >= 0) {
            shape.add(sh);
            setVolume(getVolume() - sh.getVolume());
            return true;
        }
        else return false;
    }

    public Box(double volume) {

        super(volume);
    }

    public void setShape(List<Shape> shape) {


    }
}
