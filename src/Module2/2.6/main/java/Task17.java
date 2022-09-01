import java.util.Scanner;

public class Task17 {

    /**
     * 17 Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]
     *
     *
     *
     * Пример текста:
     *
     * Света любит меня.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        for (int i = 0; i < 10; i++) {
            System.out.println(name + " любит меня");
        }
    }
}
