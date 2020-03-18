package baseCourseOfJava.lection12.HomeWork1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Артем", Specialty.PHYS, Course.FIRST));
        students.add(new Student("Александр", Specialty.CHEM, Course.SECOND));
        students.add(new Student("Александр", Specialty.PHYS, Course.THIRD));
        students.add(new Student("Татьяна", Specialty.BIO, Course.THIRD));
        students.add(new Student("Вадим", Specialty.PHYS, Course.SECOND));
        students.add(new Student("Владимир", Specialty.PHYS, Course.FIRST));
        students.add(new Student("Анастасия", Specialty.CHEM, Course.FOURTH));
        students.add(new Student("Николай", Specialty.CHEM, Course.FIFTH));
        students.add(new Student("Ольга", Specialty.MATH, Course.THIRD));
        ManageStudents manageStudents = new ManageStudents(students);
        List<Student> firstCourse = ManageStudents.groupByCourse(students, Course.FIRST);
        ManageStudents.printSpecialty(students);
        ManageStudents.printCountBySpecialty(students, Specialty.PHYS);
        ManageStudents.groupBySpecialtyThenGroupByCourse(students).forEach(System.out::println);
        System.out.println(ManageStudents.checkStudentsByCourseExceptSpecialty(students, 3, Specialty.PHYS));


    }


}
