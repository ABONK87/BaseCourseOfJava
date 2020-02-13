package baseCourseOfJava.lection4Array;

public class ClassWork5 {
    public static void main(String[] args) {
        int[][] but = new int[5][5];
        for (int i = 0; i < but.length; i++) {
            for (int j = 0; j < but.length; j++) {
                if (i < but.length / 2 + 1) {
                    if (j < i) {
                        System.out.print("0 ");
                    }
                    else if (j >= but.length - i) {
                        System.out.print("0 ");
                    }
                    else {
                        System.out.print("1 ");
                    }
                }
                else {
                    if (j > i) {
                        System.out.print("0 ");
                    }
                    else if (j <= but.length - i - 2) {
                        System.out.print("0 ");
                    }
                    else {
                        System.out.print("1 ");
                    }
                }
            }
            System.out.println();
        }
    }
}
