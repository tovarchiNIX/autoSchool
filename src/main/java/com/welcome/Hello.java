package com.welcome;

public class Hello {
    private static String userName;

    public static void setupName(String name) {
        userName = name;
    }

    public static void welcome() {
        System.out.println("Hello, " + userName);
    }

    public static void byeBye() {
        System.out.println("Bye, " + userName);
    }
}
