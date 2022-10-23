package arrayList_tasks;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 8. Самая длинная строка
 *
 * 1. Создай список строк.
 * 2. Считай с клавиатуры 5 строк и добавь в список.
 * 3. Используя цикл, найди самую длинную строку в списке.
 * 4. Выведи найденную строку на экран.
 * 5. Если таких строк несколько, выведи каждую с новой строки.
 */

public class ArrayListLongestString {
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
         * окажется длиннее, мы перезапишем эту переменную
         */
        int maxLength = strings.get(0).length();
        for (String string : strings){
            if (string.length() > maxLength) {
                maxLength = string.length();
            }
        }

        /*
         * Сверяем длину каждого элемента массива со значением максимальной длины и если они равны, выводим этот элемент
         * на экран
         */
        for (String string : strings){
            if (string.length() == maxLength) {
                System.out.println("Самая(ые) длинная(ые) строка(и): "+string);
            }
        }
    }
}
