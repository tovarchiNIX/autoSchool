package testmethods;

import java.util.Scanner;

/**
 * Создать простой Java-проект (консольное приложение), которое при запуске выводит в консоль “Hello, world!”.
 * Добавить метод printHelloName(), который будет запрашивать у пользователя ввести имя,
 * считывать введенное имя с консоли и выводить на экран приветствие “Hello, %name%”.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        printHelloName();
    }

    private static void printHelloName(){
        Scanner consoleScanner = new Scanner(System.in);
        System.out.println("What's your name?");
        System.out.println("Hello, "+ consoleScanner.nextLine());
    }
}
