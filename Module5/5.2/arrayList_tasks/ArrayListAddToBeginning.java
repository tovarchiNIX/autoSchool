package arrayList_tasks;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 10. 10 строчек в начало списка
 * 1. Создай список строк в методе main.
 * 2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
 * 3. Используя цикл, выведи содержимое на экран, каждое значение с новой строки.
 */

public class ArrayListAddToBeginning {
    public static void main(String[] args) {

        int arraySize=10;
        ArrayList<String> strings = new ArrayList<>(Arrays.asList(new String[arraySize]));

        for (int i = arraySize-1; i >= 0; i--) {
            String input;
            System.out.println("Введите строку " + (i+1));
            input = new Scanner(System.in).nextLine();
            strings.set(i, input);
        }
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
