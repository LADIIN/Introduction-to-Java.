package com.company.controller;

import com.company.model.Cave;
import com.company.utils.FileManager;
import com.company.view.Menu;

public class Main {

    public static void main(String[] args) {
        Cave cave = new Cave("Joe's cave", FileManager.readDataFromFile());

        Menu.runMenu(cave);

    }
}
