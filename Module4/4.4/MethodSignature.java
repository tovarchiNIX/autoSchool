import java.util.Scanner;

public class MethodSignature {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello, world!");
        printHelloName();

        // Обрабатываем возможнеое исключение с помоью добавления возможного исключения в сигнатуру метода
        Thread.sleep(3000L);
    }

    private static void printHelloName(){
        Scanner consoleScanner = new Scanner(System.in);
        System.out.println("What's your name?");
        System.out.println("Hello, "+ consoleScanner.nextLine());
    }
}
