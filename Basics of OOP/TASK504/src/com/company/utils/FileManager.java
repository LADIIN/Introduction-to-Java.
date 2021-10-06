package com.company.utils;

import com.company.model.Treasure;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {

    public static ArrayList<Treasure> readDataFromFile() {
        ArrayList<Treasure> treasures = new ArrayList<>(100);
        ;
        Rarity[] type = Rarity.values();

        int typeIndex;
        Rarity rarity = type[0];
        double price = 0;


        try {
            File file = new File("src/com/company/data/treasures.txt");
            FileReader fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(" - ");

                if (line.length == 4) {
                    if (line[2].matches("(?<![-.])\\b[0-9]+\\b(?!\\.[0-9])")) { // checking Integer
                        typeIndex = Integer.parseInt(line[2]);

                        if (typeIndex < type.length) {
                            rarity = type[typeIndex];
                        }
                    }
                    if (line[3].matches("^[+-]?([0-9]+([.][0-9]*)?|[.][0-9]+)$")) { // checking Double
                        price = Math.abs(Double.parseDouble(line[3]));
                    }

                    treasures.add(new Treasure(line[0], line[1], rarity, price));
                }
            }

            fileReader.close();

        } catch (IOException exception) {
            System.out.println("Error: Cant find file.");
        }

        return treasures;
    }


}
