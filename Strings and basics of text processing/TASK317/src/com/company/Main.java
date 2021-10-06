package com.company;

/*
Дана строка, содержащая следующий текст (xml-документ):

    <notes>
       <note id = "1">
           <to>Вася</to>
           <from>Света</from>
           <heading>Напоминание</heading>
           <body>Позвони мне завтра!</body>
       </note>
       <note id = "2">
           <to>Петя</to>
           <from>Маша</from>
           <heading>Важное напоминание</heading>
           <body/>
       </note>
    </notes>

Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип
(открывающий тег,  закрывающий  тег,  содержимое  тега,  тег  без  тела).
Пользоваться  готовыми  парсерами XML  для  решения  данной  задачи
нельзя
*/


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String xmlDoc = "<notes>\n" +
                "    <note id = \"1\">\n" +
                "        <to>Вася</to>\n" +
                "        <from>Света</from>\n" +
                "        <heading>Напоминание</heading>\n" +
                "        <body>Позвони мне завтра!</body>\n" +
                "    </note>\n" +
                "    <note id = \"2\">\n" +
                "        <to>Петя</to>\n" +
                "        <from>Маша</from>\n" +
                "        <heading>Важное напоминание</heading>\n" +
                "        <body/>\n" +
                "    </note>\n" +
                " </notes> \n";

        String result = parseXML(xmlDoc);
        System.out.println(result);
    }

    public static String parseXML(String xml) {
        StringBuilder strBuilder = new StringBuilder();

        Pattern pOpen = Pattern.compile("<\\w.+?>");
        Pattern pClose = Pattern.compile("</\\w+>");
        Pattern pBody = Pattern.compile(">.+?<");
        Pattern pEmpty = Pattern.compile("<\\w.+?/>");

        String[] lines = xml.split("\n\\s*");

        for (String line : lines) {
            Matcher mOpen = pOpen.matcher(line);
            Matcher mClose = pClose.matcher(line);
            Matcher mBody = pBody.matcher(line);
            Matcher mEmpty = pEmpty.matcher(line);

            if (mEmpty.find()) {
                strBuilder.append(mEmpty.group());
                strBuilder.append(" - tag without body\n");
            } else if (mOpen.find()) {
                strBuilder.append(mOpen.group());
                strBuilder.append(" - opening tag\n");
            }
            if (mBody.find()) {
                strBuilder.append(mBody.group().substring(1));
                strBuilder.append("\b - tag content\n");
            }
            if (mClose.find()) {
                strBuilder.append(mClose.group());
                strBuilder.append(" - closing tag\n");
            }

        }
        return strBuilder.toString();
    }
}