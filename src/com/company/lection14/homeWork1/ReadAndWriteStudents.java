package com.company.lection14.homeWork1;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class ReadAndWriteStudents {

    private BufferedReader reader;
    private ArrayList<Student> students;
    private FileWriter writer;


    public ReadAndWriteStudents(BufferedReader reader, FileWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void readStudents () throws IOException {
        ArrayList<Student> students1 = new ArrayList<>();
        ParsByString parsByString = new ParsByString();
        String tmp = reader.readLine();
        while (tmp != null) {
            students1.add(parsByString.parsByString(tmp));
            tmp = reader.readLine();
        }
        reader.close();
        setStudents(students1);
    }

    public void calcAndSetAverageMark () {
        students.forEach(Student::calcAndSetAverage);
    }

    public void writeStudents () throws IOException {
        for (Student s : students) {
            s.writeStudentsByAverageOfMarks(writer);
        }
        writer.close();
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReadAndWriteStudents that = (ReadAndWriteStudents) o;
        return Objects.equals(reader, that.reader) &&
                Objects.equals(students, that.students) &&
                Objects.equals(writer, that.writer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reader, students, writer);
    }
}
