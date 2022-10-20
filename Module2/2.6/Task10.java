import java.util.Scanner;

public class Task10 {

    /**
     * 10 Ввести с клавиатуры строку и число N.
     *
     * Вывести на экран строку N раз, используя цикл while.
     *
     * Пример ввода:
     *
     * абв
     *
     * 2
     *
     * Пример вывода:
     *
     * абв
     *
     * абв
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        System.out.println("Введите число больше 0");
        int num = scanner.nextInt();
        while (num > 0) {
                System.out.println("\n" + str);
                num--;
        }
    }
}
