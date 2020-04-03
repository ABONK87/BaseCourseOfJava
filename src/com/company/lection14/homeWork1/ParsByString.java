package com.company.lection14.homeWork1;

import java.util.ArrayList;

public class ParsByString {

    public ParsByString() {
    }

    public Student parsByString (String tmp) {
        ArrayList<Integer> marks = new ArrayList<>();
        int firstIndex = 0;
        String lastName = "";
        for (int i = 0; i < tmp.length(); i++){
            if (lastName.equals("") & tmp.charAt(i) == ' '){
                int lastIndex = i;
                lastName = tmp.substring(firstIndex, lastIndex);
                firstIndex = lastIndex;
                i++;
            }
            if (tmp.charAt(i) == ' ') {
                marks.add(Integer.parseInt(tmp.charAt(i - 1) + ""));
            }
            else if (i == tmp.length() - 1) {
                marks.add(Integer.parseInt(tmp.charAt(i) + ""));
            }
        }
        return new Student(lastName, marks);
    }
}
