package baseCourseOfJava.lection12.HomeWork1;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private String name;

    private Specialty specialty;

    private int course;

    public Student(String name, Specialty specialty, int course) {
        this.name = name;
        this.specialty = specialty;
        this.course = course;
    }

    public boolean isCourse(int i) {
        return i == getCourse();
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", specialty='" + specialty + '\'' +
                ", course=" + course +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(specialty, student.specialty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, specialty, course);
    }


    @Override
    public int compareTo(Student student) {
        if (this.getSpecialty().equals(student.getSpecialty())) {
            return 1;
        }
        else return 0;
    }
}
