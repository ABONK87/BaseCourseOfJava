package com.company.lection14.homeWork1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("./src/baseCourseOfJava/lection14/homeWork1/1.txt"));
        FileWriter writer = new FileWriter("./src/baseCourseOfJava/lection14/homeWork1/Students.txt", false);
        ReadAndWriteStudents readAndWriteStudents = new ReadAndWriteStudents(reader, writer);
        readAndWriteStudents.readStudents();
        readAndWriteStudents.calcAndSetAverageMark();
        readAndWriteStudents.writeStudents();
    }
}
