package baseCourseOfJava.lection6objects.HomeWork2;

import java.util.Objects;

public class Bill {
    private int denomination;//номинал купюры
    private int numberOfBil;//количество купюр

    public int getDenomination() {
        return denomination;
    }

    public void setDenomination(int denomination) {
        this.denomination = denomination;
    }

    public int getNumberOfBil() {
        return numberOfBil;
    }

    public void setNumberOfBil(int numberOfBil) {
        this.numberOfBil = numberOfBil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bill bill = (Bill) o;
        return denomination == bill.denomination &&
                numberOfBil == bill.numberOfBil;
    }

    @Override
    public int hashCode() {
        return Objects.hash(denomination, numberOfBil);
    }

    @Override
    public String toString() {
        return "Bill{" +
                "denomination=" + denomination +
                ", numberOfBil=" + numberOfBil +
                '}';
    }

    Bill(int x, int y) {
        setDenomination(x);
        setNumberOfBil(y);
    }
    Bill(int x) {
        setDenomination(x);
    }

    public void addBill(int x) {
        setNumberOfBil(getNumberOfBil() + x);
    }
}
