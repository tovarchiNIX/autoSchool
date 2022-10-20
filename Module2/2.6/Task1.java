import java.util.Scanner;

public class Task1 {

    /**
     * 1 Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
     */

    public static void main(String[] args) {
        int[] numbers = new int[2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите " + (i+1) + " число из " + numbers.length);
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        if (numbers[0] < numbers[1]) {
            System.out.println("Минимальное число: " + numbers[0]);
        }
        else if (numbers[0] == numbers[1]) {
            System.out.println("Числа равны");
        }
        else {
            System.out.println("Минимальное число: " + numbers[1]);
        }
    }
}
