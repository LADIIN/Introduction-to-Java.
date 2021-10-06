package com.company;

public class TextFile extends File {
    private String text;

    TextFile(String name, Directory directory) {
        super(name, directory);
        this.setText("");
        super.getDirectory().getFiles().add(this);
    }

    @Override
    public String toString() {
        return super.getDirectory() + "\\" + this.getName() + ":\n\n" + this.getText();
    }

    @Override
    public void renameFile(String newName) {
        this.setName(newName);
    }

    public void addText(String text) {
        this.setText(this.getText() + "\n" + text);
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
