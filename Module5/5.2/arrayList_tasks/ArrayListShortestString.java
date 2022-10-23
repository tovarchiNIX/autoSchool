package arrayList_tasks;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 9. Самая короткая строка
 *
 * 1. Создай список строк.
 * 2. Считай с клавиатуры 5 строк и добавь в список.
 * 3. Используя цикл, найди самую короткую строку в списке.
 * 4. Выведи найденную строку на экран.
 * 5. Если таких строк несколько, выведи каждую с новой строки
 */

public class ArrayListShortestString {
    public static void main(String[] args) {
        /*
         * Создаем массив типа String и записываем в переменную желаемый размер массива
         */
        int arraySize = 5;
        ArrayList<String> strings = new ArrayList<>();

        /*
         * В цикле задаем желаемый размер массива и делаем проверку на ввод пустого значение. Если значение не пустое,
         * добавляем его в массив
         */
        while (strings.size() != arraySize) {
            for (int i = 0; i < arraySize; i++) {
                String input;
                System.out.println("Введите строку " + (i + 1) + " из " + arraySize);
                input = new Scanner(System.in).nextLine();
                while (input.length() == 0){
                    System.out.println("Строка должна быть более одного символа. Введите строку");
                    input = new Scanner(System.in).nextLine();
                }
                strings.add(input);
            }
        }

        /*
         * Задаем начальную длину строки, с которой будем сравнивать все последующие. Если следующий элемент массива
         * окажется короче, мы перезапишем эту переменную
         */
        int minLength = strings.get(0).length();
        for (String string : strings){
            if (string.length() < minLength) {
                minLength = string.length();
            }
        }

        /*
         * Сверяем длину каждого элемента массива со значением минимальной длины и если они равны, выводим этот элемент
         * на экран
         */
        for (String string : strings){
            if (string.length() == minLength) {
                System.out.println("Самая(ые) короткая(ие) строка(и): "+string);
            }
        }
    }
}
