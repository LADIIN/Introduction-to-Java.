package com.company;

//Подсчитать, сколько раз среди символов заданной строки встречается буква “

public class Main {

    public static void main(String[] args) {
        String text = """
                Do not go gentle into that good night,
                Old age should burn and rave at close of day;
                Rage, rage against the dying of the light.""";

        System.out.println(text + "\nAmount of letter a:\n" + countLetter(text));
    }

    private static int countLetter(String text){
        int counter = 0;

        for (int i = 0;i < text.length();i++){
            if (text.charAt(i) == 'a' || text.charAt(i) == 'A'){
                counter++;
            }
        }
        return counter;
    }
}
