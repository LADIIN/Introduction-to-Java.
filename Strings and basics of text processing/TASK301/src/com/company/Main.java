package com.company;

//Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] camelCase = {"stringBuilder", "camelCase", "toUpperCase",
                "snakeCase", "toCharArray", "deleteCharAt"};

        String[] snakeCase = convertToSnakeCase(camelCase);

        System.out.println(Arrays.toString(camelCase));
        System.out.println(Arrays.toString(snakeCase));
    }

    private static String[] convertToSnakeCase(String[] camelCase) {
        String[] snakeCase = new String[camelCase.length];

        for (int i = 0; i < snakeCase.length; i++) {
            StringBuilder strBuilder = new StringBuilder();

            for (int j = 0; j < camelCase[i].length(); j++) {
                char letter = camelCase[i].toCharArray()[j];

                if (Character.isLowerCase(letter)) {
                    strBuilder.append(letter);
                } else {
                    strBuilder.append("_");
                    strBuilder.append(Character.toLowerCase(letter));
                }
            }
            snakeCase[i] = strBuilder.toString();
        }
        return snakeCase;
    }
}
