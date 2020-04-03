package com.company.lection12.HomeWork1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Артем", Specialty.PHYSICS, Course.FIRST));
        students.add(new Student("Александр", Specialty.CHEMISTRY, Course.SECOND));
        students.add(new Student("Александр", Specialty.PHYSICS, Course.THIRD));
        students.add(new Student("Татьяна", Specialty.BIOLOGY, Course.THIRD));
        students.add(new Student("Вадим", Specialty.PHYSICS, Course.SECOND));
        students.add(new Student("Владимир", Specialty.PHYSICS, Course.FIRST));
        students.add(new Student("Анастасия", Specialty.CHEMISTRY, Course.FOURTH));
        students.add(new Student("Николай", Specialty.CHEMISTRY, Course.FIFTH));
        students.add(new Student("Ольга", Specialty.MATHS, Course.THIRD));
        ManageStudents manageStudents = new ManageStudents(students);
        List<Student> firstCourse = ManageStudents.groupByCourse(students, Course.FIRST);
        ManageStudents.printSpecialty(students);
        ManageStudents.printCountBySpecialty(students, Specialty.PHYSICS);
        ManageStudents.groupBySpecialtyThenGroupByCourse(students).forEach(System.out::println);
        System.out.println(ManageStudents.checkStudentsByCourseExceptSpecialty(students, Course.THIRD, Specialty.PHYSICS));
    }
}
