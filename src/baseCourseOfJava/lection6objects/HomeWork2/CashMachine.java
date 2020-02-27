package baseCourseOfJava.lection6objects.HomeWork2;

import java.util.Objects;
import java.util.Scanner;

public class CashMachine {
    Bill twenty = new Bill(20);
    Bill fifty = new Bill(50);
    Bill one_hundred = new Bill(100);
    CashMachine(int x, int y, int z) {
        twenty.setNumberOfBil(z);
        fifty.setNumberOfBil(y);
        one_hundred.setNumberOfBil(x);
    }
        public boolean getCash(int cash) {
        int givedOneHundred = 0;
        int givedFifty = 0;
        int givedTwenty = 0;
        boolean flag = false;
        for (int i = one_hundred.getNumberOfBil(); i > 0; i--) {
            if (cash >= one_hundred.getDenomination() && ((cash - one_hundred.getDenomination()) >= fifty.getDenomination() || (cash - one_hundred.getDenomination()) == 0)) {
                cash -= one_hundred.getDenomination();
                givedOneHundred++;
            }
            if (cash == 0) {
                flag = true;
                break;
            }
        }
        for (int i = fifty.getNumberOfBil(); i > 0; i--) {
            if (cash >= fifty.getDenomination() && ((cash - fifty.getDenomination()) >= twenty.getDenomination() || (cash - fifty.getDenomination()) == 0)) {
                cash -= fifty.getDenomination();
                givedFifty++;
            }
            if (cash == 0) {
                flag = true;
                break;
            }
        }
        for (int i = twenty.getNumberOfBil(); i > 0; i--) {
            if (cash >= twenty.getDenomination()) {
                cash -= twenty.getDenomination();
                givedTwenty++;
            }
            if (cash == 0) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Операция выполнена успешно");
            System.out.printf("Количество %d: %d, количество %d: %d, количество %d: %d\n",one_hundred.getDenomination(), givedOneHundred, fifty.getDenomination(), givedFifty, twenty.getDenomination(), givedTwenty);
        }
        else {
            System.out.println("Операция не выполнена");
        }
        return flag;
    }
}
