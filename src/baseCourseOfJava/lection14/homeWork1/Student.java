package baseCourseOfJava.lection14.homeWork1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private String lastName;
    private ArrayList<Integer> marks;
    private double averageOfMarks = 0;

    public Student(String lastName, ArrayList<Integer> marks) {
        this.lastName = lastName;
        this.marks = marks;
    }

    public String printMarks() {
        StringBuilder stringMarks = new StringBuilder();
        for (int x: marks) {
               stringMarks.append(x).append(" ");
        }
        return stringMarks.toString();
    }

    public void calcAndSetAverage() {
        int sum = 0;
        double average;
        for (int x: marks) {
            sum += x;
        }
        average = (double) sum / marks.size();
        setAverageOfMarks(average);
    }

    public void writeStudentsByAverageOfMarks (FileWriter writer) throws IOException {
        if (averageOfMarks >= 7) {
            writer.write(lastName.toLowerCase() + ":" + " " + printMarks() + '\n');
        }
        else {
            writer.write(lastName.toUpperCase() + ":" + " " + printMarks() + '\n');
        }
    }

    public void setAverageOfMarks(double averageOfMarks) {
        this.averageOfMarks = averageOfMarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(averageOfMarks, averageOfMarks) == 0 &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, marks, averageOfMarks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", marks=" + marks +
                ", averageOfMarks=" + averageOfMarks +
                '}' + '\n';
    }
}
