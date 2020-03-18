package baseCourseOfJava.lection12.HomeWork1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
                students.add(new Student("Артем", "Физика", 1));
                students.add(new Student("Александр", "Химия", 2));
                students.add(new Student("Александр", "Физика", 2));
                students.add(new Student("Татьяна", "Биология", 3));
                students.add(new Student("Вадим", "Физика", 2));
                students.add(new Student("Владимир", "Физика", 1));
                students.add(new Student("Анастасия", "Химия", 4));
                students.add(new Student("Николай", "Биология", 1));
                students.add(new Student("Ольга", "Математика", 3));
        List<Student> firstCourse = groupByCourse(students, 1);
        printSpecialty(students);
        printCountBySpecialty(students, "Физика");
        groupBySpecialtyThenGroupByCourse(students).stream().forEach(System.out::println);
        System.out.println(checkStudentsByCourseExceptSpecialty(students, 3, "физика"));



    }

    public static List<Student> groupByCourse(List<Student> students, int i) {
        return students.stream().filter(s -> s.getCourse() == 1).collect(Collectors.toList());
    }

    public static void printSpecialty(List<Student> students) {
        students.stream().map(Student::getSpecialty).sorted().forEach(System.out::println);
    }

    public static void printCountBySpecialty(List<Student> students, String specialty) {
        System.out.println(students.stream().filter(s -> s.getSpecialty().equals(specialty)).count());
    }

    public static List<Student> groupBySpecialtyThenGroupByCourse(List<Student> students) {
        return students.stream().sorted(Comparator.comparing(Student::getSpecialty).thenComparing(Student::getCourse)).collect(Collectors.toList());
    }

    public static boolean checkStudentsByCourseExceptSpecialty(List<Student> students, int course, String exceptSpecialty) {
        int a = (int) students.stream().filter(s -> s.getCourse() == course).filter(s -> !s.getSpecialty().equals(exceptSpecialty)).count();
        return a != 0;
    }
}
