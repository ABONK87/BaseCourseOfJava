package baseCourseOfJava.lection9collections.HomeWork2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BlackBox {
    private int k = 0;
    List<Integer> blackBox = new ArrayList<>();
    SortNum sortNum = new SortNum();
    public void add(int x) {
        blackBox.add(x);
        k++;
        blackBox.sort(sortNum);
    }
    public Integer getMin (int i) {
        return blackBox.get(i - 1);
    }
    public void print () {
        Iterator<Integer> itr = blackBox.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println("");
    }
}
