package com.buyalskaya.day2.main;

import com.buyalskaya.day2.console.PrintResult;
import com.buyalskaya.day2.service.ArithmeticService;

public class MainRandom {
    public static void main(String[] args) {
        int amountOfRandom = Integer.parseInt(args[0]);
        boolean isNewLine = Boolean.parseBoolean(args[1]);
        ArithmeticService arithmeticService = new ArithmeticService();
        int[] arrayRandom = arithmeticService.arrayRandom(amountOfRandom);
        PrintResult printRandom = new PrintResult();
        printRandom.printRandom(arrayRandom, isNewLine);
    }
}
