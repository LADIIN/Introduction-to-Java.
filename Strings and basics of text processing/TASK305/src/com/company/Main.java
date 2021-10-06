package com.company;

//Удалить  в  строке  все  лишние  пробелы,
//то  есть  серии  подряд  идущих  пробелов  заменить  на  одиночные  пробелы.
//Крайние пробелы в строке удалить.

public class Main {

    public static void main(String[] args) {

        String text = "   This text  with    redudant spaces   !!    ";

        System.out.println(text + "\nResult: " + deleteRedudantSpaces(text));
        
    }

    private static String deleteRedudantSpaces(String text) {
        StringBuilder strBuilder = new StringBuilder();

        text = text.trim();
        boolean redudantSpace = false;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                if (!redudantSpace) {
                    strBuilder.append(' ');
                    redudantSpace = true;
                }
            } else {
                strBuilder.append(text.charAt(i));
                redudantSpace = false;
            }
        }
        return strBuilder.toString();
    }
}
