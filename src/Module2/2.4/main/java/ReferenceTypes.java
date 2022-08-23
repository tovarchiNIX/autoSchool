import methods.Methods;

import java.io.FileNotFoundException;

public class ReferenceTypes {
    private static final String filePath = "src/Module2/2.4/main/resources/testFile.txt";

    public static void main(String[] args) throws FileNotFoundException {
        /***
         * 1 Дана строка. Вывести первый, последний и средний (если он есть) символы. Напишите программу, которая
         * выводит часть строки до первой встреченной точки, включая точку. Также предусмотрите вывод количества
         * пробелов.
         */
        Methods obj = new Methods(filePath);
        String fullString = obj.getStringFromFile();
        obj.printFirstChar(fullString);
        obj.printMiddleChar(fullString);
        obj.printLastChar(fullString);
        String firstSentence = obj.getFirstSentence(fullString);
        System.out.println("Первое предложение: \n" + firstSentence);
        int spaceCount = obj.getSpaceCount(firstSentence);
        System.out.println("Количество пробелов в тексте: " + spaceCount);

        /***
         * 2 Найти в строке указанную подстроку и заменить ее на новую. Строку, ее подстроку для замены и новую
         * подстроку вводит пользователь.
         */
        obj.setInitialString();
        obj.setSubstringToReplace();
        obj.setTextToReplace();
        obj.replaceText();

        /***
         * 3 Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай,
         * когда самых длинных слов может быть несколько, не обрабатывать.
         */
        obj.setTextWithSpaces();
        obj.printLongestWord();
    }
}
