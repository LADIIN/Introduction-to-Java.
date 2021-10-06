package com.company;

//В строке вставить после каждого символа 'a' символ 'b'.

public class Main {

    public static void main(String[] args) {
        String text = """
                Do not go gentle into that good night,
                Old age should burn and rave at close of day;
                Rage, rage against the dying of the light.""";

        System.out.println(text + "\nResult:\n" + insertAfterletterA(text));
    }

    private static String insertAfterletterA(String text) {
        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            strBuilder.append(text.charAt(i));

            if (text.charAt(i) == 'a') {
                strBuilder.append('b');
            }
        }
        return strBuilder.toString();
    }
}
