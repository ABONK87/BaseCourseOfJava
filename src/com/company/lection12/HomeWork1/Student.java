package com.company.lection12.HomeWork1;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private String name;

    private Specialty specialty;

    private Course course;

    public Student(String name, Specialty specialty, Course course) {
        this.name = name;
        this.specialty = specialty;
        this.course = course;
    }

    public boolean isCourse(Course i) {
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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
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
