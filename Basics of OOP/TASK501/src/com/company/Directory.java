package com.company;

import java.util.ArrayList;

public class Directory {
    private String name;
    private ArrayList<TextFile> files;

    Directory(String name) {
        this.setName(name);
        this.files = new ArrayList<>();
    }

    @Override
    public String toString() {
        return this.getName();
    }

    public void createFile(String name) {
        this.getFiles().add(new TextFile(name, this));
    }

    public TextFile getFile(String name) {
        for (TextFile file : this.files) {
            if (file.getName().equals(name)) {
                return file;
            }
        }
        System.out.println("\nThere is no such file.");
        return null;
    }

    public void deleteFile(String name) {
        this.getFiles().removeIf(file -> file.getName().equals(name));
    }

    public ArrayList<TextFile> getFiles() {
        return this.files;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
