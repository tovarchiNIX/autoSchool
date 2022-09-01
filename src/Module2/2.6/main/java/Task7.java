import java.util.Random;
import java.util.Scanner;

public class Task7 {

    /**
     * 7 За семь попыток угадать число. При каждой попытке вам будет выводиться сообщение - "Мало" или "Много".
     * Если угадаете, уложившись в семь попыток, то выводится сообщение "Угадал :)" и программа завершает работу.
     * Если по истечении 7 попыток число не угадывается, то выводится сообщение "Не угадал :(" и завершается работа.
     *
     * Для генерации секретного числа используете код:
     *
     * Random random = new Random();
     *
     * int secret;
     *
     * // Генерируем число от 0 до 20
     *
     * secret = random.nextInt(20 + 1);
     */

    public static void main(String[] args) {
        int secret = new Random().nextInt(20 + 1);
        int attempts = 7;
        for (int i = 1; i <= attempts; i++) {
            System.out.println("Угадай число. Попытка " + i + " из " + attempts);
            int guess = new Scanner(System.in).nextInt();
            if (i == attempts) {
                System.out.println("Не угадал :(");
                break;
            }
            if (guess == secret) {
                System.out.println("Угадал :)");
                break;
            } else if (guess > secret) {
                System.out.println("Много");
            } else {
                System.out.println("Мало");
            }
        }
    }
}
