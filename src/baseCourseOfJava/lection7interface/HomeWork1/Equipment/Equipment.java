package baseCourseOfJava.lection7interface.HomeWork1.Equipment;

public class Equipment implements Turnible {

    int power;

    public Equipment() {
        this.power = 0;
    }

    public Equipment(int power) {
        this.power = power;
    }

    @Override
    public void turnOnInSocket() {
        boolean isOnSocket = true;
    }


    @Override
    public void turnOffFromSocket() {
        boolean isOnSocket = false;
    }
}
