package baseCourseOfJava.lection3Cycles.classWork;

public class Task4 {
    public static void main(String[] args) {
        //задача вывести дату следующего дня
        int day = 31;
        int month = 12;
        int year = 2019;
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day == 31)) {
            day = 1;
            if (month == 12) {
                month = 1;
                year += 1;
            }
            else {
                month += 1;
            }
        }
        else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day == 30)) {
            day = 1;
            month += 1;
        }
        else if (month == 2 && day == 28) {
            day = 1;
            month += 1;
        }
        else {
            day += 1;
            month += 1;
        }

        System.out.println(day + "." + month + "." + year);
    }
}
