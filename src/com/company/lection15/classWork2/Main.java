package com.company.lection15.classWork2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("./src/com/company/lection15/classWork2/1.txt"));
        FileWriter writer = new FileWriter("./src/com/company/lection15/classWork2/2.txt", false);
        String tmp = reader.readLine();
        String temp;
        while (tmp != null) {

            String[] words = tmp.split(" ");
            temp = words[0];
            words[0] = words[words.length - 1];
            words [words.length - 1] = temp;
            for (String word : words) {
                writer.write(word + " ");
            }
            writer.write('\n');

            tmp = reader.readLine();

        }
        reader.close();
        writer.close();
    }
}
