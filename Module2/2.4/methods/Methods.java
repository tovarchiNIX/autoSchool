package methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Methods {
    private final String filePath;
    private static int stringLength;
    private static final Scanner scanner = new Scanner(System.in);
    private static String initialUserInputText;
    private static String substringToReplace;
    private static String textToReplace;


    public Methods(String filePath) {
        this.filePath = filePath;
    }

    /***
     *
     * @return Returns text from a given file.
     * @throws FileNotFoundException Exception in case needed file is not found.
     */
    public String getStringFromFile() throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File(filePath));
        String textFromFile = "";
        while(fileScanner.hasNextLine()) {
            textFromFile = textFromFile.concat(fileScanner.nextLine());
        }
        return textFromFile;
    }

    /***
     *
     * @param string Text to return the first sentence from.
     * @return Returns the first sentence from a given text.
     */
    public String getFirstSentence(String string) {
        int dotIndex = string.indexOf('.');
        return string.substring(0, dotIndex + 1);
    }

    /***
     *
     * @param string Text to find spaces from.
     * @return Number of spaces in a given text.
     */
    public int getSpaceCount(String string) {
        int spaceCount = 0;
        for(char element : string.toCharArray()) {
            if (element == ' ') {
                spaceCount++;
            }
        }
        return spaceCount;
    }

    /***
     * Method saves user input text to a class field.
     */
    public void setInitialString() {
        System.out.println("Введите строку");
        initialUserInputText = scanner.nextLine();
    }

    /***
     * Method saves user input text to a class field.
     */
    public void setSubstringToReplace() {
        System.out.println("Введите подстроку");
        substringToReplace = scanner.nextLine();
    }

    /***
     * Method saves user input text to a class field.
     */
    public void setTextToReplace() {
        System.out.println("Введите подстроку для замены");
        textToReplace = scanner.nextLine();
    }

    /***
     * Method saves user input text to a class field.
     */
    public void setTextWithSpaces() {
        System.out.println("Введите строку слов, разделенных пробелами");
        initialUserInputText = scanner.nextLine();
    }

    /***
     * Method verifies whether a user input text contains a substring and replaces a substring with a new text.
     */
    public void replaceText() {
        if (initialUserInputText.contains(substringToReplace)) {
            System.out.println("Строка после замены: \n" + initialUserInputText.replace(substringToReplace,
                    textToReplace));
        } else {
            System.out.println("Текста подстроки для замены нет в оригинальной строке");
        }
    }

    /**
     *
     * @param string Text to return the first character from.
     */
    public void printFirstChar(String string) {
        System.out.println("Первый символ строки: " + string.charAt(0));
    }

    /***
     *
     * @param string Text to return the middle character from.
     */
    public void printMiddleChar(String string) {
        stringLength = string.length();
        int div = stringLength / 2;
        if (stringLength % 2 == 1) {
            System.out.println("Средний символ строки: " + string.charAt(div + 1));
        } else {
            System.out.println("Среднего символа строки нет");
        }
    }

    /***
     *
     * @param string Text to return the last character from.
     */
    public void printLastChar(String string) {
        stringLength = string.length();
        System.out.println("Последний символ строки: " + string.charAt(stringLength -1));
    }

    /***
     * Method defines the longest word in a text and prints it.
     */
    public void printLongestWord() {
        String maxLengthWord = "";
        String words[] = initialUserInputText.split(" ");
        for (String word : words) {
            if (word.length() > maxLengthWord.length()) {
                maxLengthWord = word;
            } else if (word.length() == maxLengthWord.length()) {
                System.out.printf("Мы уже нашли слово этой же длины %s, поэтому пропускаем слово %s",
                        maxLengthWord, word);
            }
        }
        System.out.println("\nСлово максимальной длины: \n" + maxLengthWord);
    }
}