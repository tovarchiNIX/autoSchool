import java.util.Scanner;

public class Task6 {

    /**
     * 6 Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно»
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        System.out.println("Введите возраст");
        int age = scanner.nextInt();
        if (age > 20) {
            System.out.println("И 18-ти достаточно, " + name);
        }
    }
}
