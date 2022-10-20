import java.util.Scanner;

public class TwoArrays {

    /**
     * 2 массива
     *
     * 1. Создать массив на 10 строк.
     * 2. Создать массив на 10 чисел.
     * 3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
     * 4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает
     * с текущим индексом из массива чисел.
     * 5. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
     */

    public static void main(String[] args) {
        String[] strArray = createStringArray();
        int[] intArray = createIntArray(strArray);
        printIntArray(intArray);
    }

    private static String[] createStringArray() {
        String[] array = new String[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите слово " + (i + 1) + " из " + array.length);
            array[i] = scanner.nextLine();
        }
        return array;
    }

    private static int[] createIntArray(String[] strings) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = strings[i].length();
        }
        return array;
    }

    private static void printIntArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("На позиции " + i + " массива находится значение " + numbers[i]);
        }
    }
}
