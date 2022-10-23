package arrayList_tasks;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 11. Удали последнюю строку и вставь её в начало
 *
 * 1. Создай список строк.
 * 2. Добавь в него 5 строчек с клавиатуры.
 * 3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
 * 4. Используя цикл, выведи содержимое на экран, каждое значение с новой строки
 */

public class ArrayListRemoveLastString {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        int arraySize = 5;
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Введите строку "+(i+1));
            String input = new Scanner(System.in).nextLine();
            strings.add(input);
        }

        for (int i = 1; i <= 13; i++) {
            int firstInd = 0;
            int lastInd = strings.size()-1;
            String lastElement = strings.get(lastInd);
            strings.remove(lastInd);
            strings.add(firstInd, lastElement);
        }

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
