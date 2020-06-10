package com.buyalskaya.day2.main;

public class CommandInverseParams {
    public static void main(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.console().printf("Argument %d = %s\n", i, args[i]);
        }
    }
}