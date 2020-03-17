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
        List<Student> firstCourse = students.stream().filter(s -> s.getCourse() == 1).collect(Collectors.toList());
        firstCourse.stream().map(Student::getSpecialty).sorted().forEach(System.out::println);
        System.out.println(students.stream().filter(s -> s.getSpecialty().equals("Физика")).count());
        System.out.println(students.stream().filter(s -> s.getSpecialty().equals("Химия")).count());
        System.out.println(students.stream().filter(s -> s.getSpecialty().equals("Биология")).count());
        System.out.println(students.stream().filter(s -> s.getSpecialty().equals("Математика")).count());
        students.stream().sorted(Comparator.comparing(Student::getSpecialty).thenComparing(Student::getCourse)).forEach(System.out::println);
        students.stream().filter(s -> s.getCourse() == 3).filter(s -> !s.getSpecialty().equals("Физика")).forEach(System.out::println);


    }
}
