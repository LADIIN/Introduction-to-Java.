package com.company;

abstract class File {
    private String name;
    private Directory directory;

    public File(String name, Directory directory) {
        this.setName(name);
        this.setDirectory(directory);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public void renameFile(String newName);

    public Directory getDirectory() {
        return this.directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }
}
