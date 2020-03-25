package baseCourseOfJava.lection12.HomeWork1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ManageStudents {

    private List<Student> students;

    public ManageStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public static List<Student> groupByCourse(List<Student> students, Course a) {
        return students.stream().filter(s -> s.getCourse().equals(a)).collect(Collectors.toList());
    }

    public static void printSpecialty(List<Student> students) {
        students.stream().map(Student::getSpecialty).collect(Collectors.toSet()).forEach(System.out::println);
    }

    public static void printCountBySpecialty(List<Student> students, Specialty specialty) {
        System.out.println(students.stream().filter(s -> s.getSpecialty().equals(specialty)).count());
    }

    public static List<Student> groupBySpecialtyThenGroupByCourse(List<Student> students) {
        return students.stream().sorted(Comparator.comparing(Student::getSpecialty).thenComparing(Student::getCourse)).collect(Collectors.toList());
    }

    public static boolean checkStudentsByCourseExceptSpecialty(List<Student> students, Course c, Specialty exceptSpecialty) {
        double a = students.stream().filter(s -> s.getCourse().equals(c)).filter(s -> !s.getSpecialty().equals(exceptSpecialty)).count();
        return a != 0;
    }
}
