import java.util.Scanner;

public class Task14 {

    /**
     * 14 Ввести с клавиатуры два числа m и n.
     *
     * Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
     *
     *
     *
     * Пример: m=2, n=4
     *
     * 8888
     *
     * 8888
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
