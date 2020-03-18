package baseCourseOfJava.lection12.HomeWork1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
                students.add(new Student("Артем", Specialty.PHYS, 1));
                students.add(new Student("Александр", Specialty.CHEM, 2));
                students.add(new Student("Александр", Specialty.PHYS, 2));
                students.add(new Student("Татьяна", Specialty.BIO, 3));
                students.add(new Student("Вадим", Specialty.PHYS, 2));
                students.add(new Student("Владимир", Specialty.PHYS, 1));
                students.add(new Student("Анастасия", Specialty.CHEM, 4));
                students.add(new Student("Николай", Specialty.CHEM, 1));
                students.add(new Student("Ольга", Specialty.MATH, 3));
        List<Student> firstCourse = groupByCourse(students, 1);
        printSpecialty(students);
        printCountBySpecialty(students, Specialty.PHYS);
        groupBySpecialtyThenGroupByCourse(students).forEach(System.out::println);
        System.out.println(checkStudentsByCourseExceptSpecialty(students, 3, Specialty.PHYS));



    }

    public static List<Student> groupByCourse(List<Student> students, int i) {
        return students.stream().filter(s -> s.getCourse() == 1).collect(Collectors.toList());
    }

    public static void printSpecialty(List<Student> students) {
        students.stream().map(Student::getSpecialty).collect(Collectors.toSet()).stream().sorted().forEach(System.out::println);
    }

    public static void printCountBySpecialty(List<Student> students, Specialty specialty) {
        System.out.println(students.stream().filter(s -> s.getSpecialty().equals(specialty)).count());
    }

    public static List<Student> groupBySpecialtyThenGroupByCourse(List<Student> students) {
        return students.stream().sorted(Comparator.comparing(Student::getSpecialty).thenComparing(Student::getCourse)).collect(Collectors.toList());
    }

    public static boolean checkStudentsByCourseExceptSpecialty(List<Student> students, int course, Specialty exceptSpecialty) {
        int a = (int) students.stream().filter(s -> s.getCourse() == course).filter(s -> !s.getSpecialty().equals(exceptSpecialty)).count();
        return a != 0;
    }
}
