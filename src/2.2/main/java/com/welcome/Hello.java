package com.welcome;

public class Hello {
    private String userName;

    public void setupName(String userName) {
        this.userName = userName;
    }

    public void welcome() {
        System.out.println("Hello, " + userName);
    }

    public void byeBye() {
        System.out.println("Bye, " + userName);
    }
}
