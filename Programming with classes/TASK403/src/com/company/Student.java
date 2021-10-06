package com.company;

public class Student {
    private String fullname;
    private int group;
    private int[] marks;

    public Student(String fullname, int group, int[] marks) {
        this.setFullname(fullname);
        this.setGroup(group);
        this.setMarks(marks);
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String getFullname() {
        return this.fullname;
    }

    public int getGroup() {
        return this.group;
    }

    public int[] getMarks() {
        return this.marks;
    }
}
