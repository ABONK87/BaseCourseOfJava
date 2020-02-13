package baseCourseOfJava.lection4Array;

import java.util.Arrays;
import java.util.Random;

public class ClassWork4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(15);
        }
        int tmp = 0;
        System.out.println(Arrays.toString(num));
        for (int i = 0; i < num.length / 2; i++) {
            tmp = num[num.length - 1 - i];
            num[num.length - 1 - i] = num[i];
            num[i] = tmp;
        }
        System.out.println(Arrays.toString(num));
    }
}
