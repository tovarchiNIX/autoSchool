import java.util.Scanner;

public class IntArrayReverseOrder {

    /**
     *  Массив из чисел в обратном порядке
     *
     * 1. Создать массив на 10 чисел.
     * 2. Ввести с клавиатуры 10 чисел и записать их в массив.
     * 3. Расположить элементы массива в обратном порядке.
     * 4. Вывести результат на экран, каждое значение выводить с новой строки.
     */

    public static void main(String[] args) {
        int[] intArray = createIntArray();
        int[] reversedArray = reverseArray(intArray);
        printArray(reversedArray);
    }

    private static int[] createIntArray() {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите значение для ячейки " + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        return array;
    }

    private static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        int index = reversedArray.length - 1;
        for (int number : array) {
            reversedArray[index] = number;
            index--;
        }
        return reversedArray;
    }

    private static void printArray(int[] array) {
        for(int number : array) {
            System.out.println(number);
        }
    }
}
