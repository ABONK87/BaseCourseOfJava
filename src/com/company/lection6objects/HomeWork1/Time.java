package com.company.lection6objects.HomeWork1;

import java.util.Objects;

public class Time {
//    Создать класс и объекты описывающие промежуток времени.
//    Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//    Сделать методы для получения полного количества секунд в объекте,
//    сравнения двух объектов (метод должен работать аналогично compareTo в строках).
//    Создать два конструктора: получающий общее количество секунд, и часы, минуты и секунды по отдельности.
//    Сделать метод для вывода данных. Прочее на ваше усмотрение.

    private int s, m, h;
    private boolean flag = true;

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return s == time.s &&
                m == time.m &&
                h == time.h &&
                flag == time.flag;
    }

    @Override
    public int hashCode() {
        return Objects.hash(s, m, h, flag);
    }

    @Override
    public String toString() {
        return "Time{" +
                "s=" + s +
                ", m=" + m +
                ", h=" + h +
                ", flag=" + flag +
                '}';
    }

    public Time(int h, int m, int s) {
        if (h > 23) {
            System.out.println("Количество часов не может быть больше 23");
            flag = false;
        }
        else {
            setH(h);
        }
        if (m > 59) {
            System.out.println("Количество минут не может быть больше 59");
            flag = false;
        }
        else {
            setM(m);
        }
        if (s > 59) {
            System.out.println("Количество секунд не может быть больше 59");
            flag = false;
        }
        else {
            setS(s);
        }
    }

    public Time(int t) {
        if (t > 86399) {
            System.out.println("Количество секунд не может быть больше 86399");
            flag = false;
        }
        else {
            int h = t / 3600;
            int m = (t - h * 3600) / 60;
            int s = t - h * 3600 - m * 60;
            setH(h);
            setM(m);
            setS(s);
        }
    }

    public Time() {
        System.out.println("Время не было задано");
    }

    public int getSecond() {
        return getH() * 3600 + getM() * 60 + getS();
    }

    public void getTime() {
        System.out.printf("Время %d:%d:%d \n", getH(), getM(), getS());
    }

    public int compareTime(Time timeObject) {
        return Integer.compare(this.getSecond(), timeObject.getSecond());
    }

    public int compareTime(int second) {
        return Integer.compare(this.getSecond(), second);
    }
}
