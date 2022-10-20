import java.util.Scanner;

public class StringArrayReverseOrder {

    /**
     * Массив из строчек в обратном порядке
     *
     * 1. Создать массив на 10 строчек.
     * 2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
     * 3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
     */

    public static void main(String[] args) {
        String[] stringArray = initArrayAndPopulatePartially();
        printInReverse(stringArray);
    }

    private static String[] initArrayAndPopulatePartially() {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[10];
        int limit = 8;
        for (int i = 0; i < limit; i++) {
            System.out.println("Введите " + (i + 1) + " слово в массиве из " + array.length);
            array[i] = scanner.nextLine();
        }
        return array;
    }

    private static void printInReverse(String[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println((i + 1) + " элемент массива: " + array[i]);
        }
    }
}
