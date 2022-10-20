import java.util.Scanner;

public class TryCatchHandling {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        printHelloName();

        // Обрабатываем возможнеое исключение с помоью try/catch
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printHelloName(){
        Scanner consoleScanner = new Scanner(System.in);
        System.out.println("What's your name?");
        System.out.println("Hello, "+ consoleScanner.nextLine());

        // При генерации исключения, выводим наш текст на консоль, вместо стандартного трейса
        try {
            int zero = 5/0;
        } catch (ArithmeticException e) {
            System.out.println("You shall not fall");
        }
    }
}
