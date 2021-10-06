package com.company;

public class Analyzer {

    public static String findBestStudents(Student[] students) {
        StringBuilder strBuilder = new StringBuilder();

        if (students.length == 0) {
            return "\nThere is no students in array.";
        }

        for (Student student : students) {
            int counter = 0;
            for (int mark : student.getMarks()) {
                if (mark == 9 || mark == 10) {
                    counter++;
                }
            }
            if (counter == student.getMarks().length) {
                strBuilder.append("\n").append(student.getFullname());
                strBuilder.append(" - ").append(student.getGroup());
            }
        }
        return strBuilder.toString();
    }
}
