package com.buyalskaya.day2.main;

public class MainPassword {
    public static final String PASSWORD = "helloworld";

    public static void main(String[] args) {
        String password = System.console().readLine("Enter a password\n");
        if (password.equals(PASSWORD)) {
            System.out.println("This password is correct");
        } else {
            System.out.println("This password is incorrect");
        }
    }
}
