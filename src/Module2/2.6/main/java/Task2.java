import java.util.Scanner;

public class Task2 {

    /**
     * 2 Ввести с клавиатуры четыре числа, и вывести максимальное из них.
     */

    public static void main(String[] args) {

        int[] numbers = new int[4];
        int size = numbers.length;
        int maxValue = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("Введите число " + (i + 1) + " из " + size);
            numbers[i] = Integer.parseInt(scanner.nextLine());
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        System.out.println("Максимальное число: " + maxValue);
    }
}
