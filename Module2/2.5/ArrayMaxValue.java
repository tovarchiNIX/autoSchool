import java.util.Scanner;

public class ArrayMaxValue {

    /**
     * Максимальное среди массива на 20 чисел
     *
     * 1. В методе initializeArray():
     * 1.1. Создайте массив на 20 чисел
     * 1.2. Считайте с консоли 20 чисел и заполните ими массив
     * 2. Метод max(int[] array) должен находить максимальное число из элементов массива
     */

    public static void main(String[] args) {
        int[] array  = initializeArray();
        int maxArrayValue = max(array);
        System.out.println("Максимальное число массива: " + maxArrayValue);

    }

    private static int[] initializeArray() {
        int[] numbers = new int[20];
        int size = numbers.length;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("Введите число " + (i + 1) + " из " + size);
            String input = scanner.nextLine();
            numbers[i] = Integer.parseInt(input);
        }
        return numbers;
    }

    private static int max(int[] array) {
        int maxValue = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
