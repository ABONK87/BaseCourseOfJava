package baseCourseOfJava.lection3Cycles.homeWork;

public class Lection3HomeWork1 {
    public static void main(String[] args) {
//                Имеются два дома размерами a на b и c на d.
//                Имеется участок размерами e на f.
//                Проверить помещаются ли эти дома на данном участке.
//                Стороны домов — параллельны сторонам участка,
//                в остальном размещение может быть любым.
        int a = 5;//размеры первого дома
        int b = 3;
        int c = 7;//размеры второго дома
        int d = 9;
        int e = 5;//размеры участка
        int f = 7;
        if ((e >= a || e >= b) && (f >= a || f >= b)) {
            System.out.println("Первый дом помещается на участке");
        }
        else {
            System.out.println("Первый дом не помещается на участке");
        }
        if ((e >= c || e >= d) && (f >= c || f >= d)) {
            System.out.println("Второй дом помещается на участке");
        }
        else {
            System.out.println("Второй дом не помещается на участке");
        }
    }
}
