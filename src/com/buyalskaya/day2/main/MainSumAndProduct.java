package com.buyalskaya.day2.main;

import com.buyalskaya.day2.console.PrintResult;
import com.buyalskaya.day2.parser.NumberParser;
import com.buyalskaya.day2.service.ArithmeticService;

public class MainSumAndProduct {
    public static void main(String[] args) {
        PrintResult printRandom = new PrintResult();
        ArithmeticService arithmeticService = new ArithmeticService();
        NumberParser numberParser = new NumberParser();
        int[] arrayInteger = numberParser.integerParser(args);
        int sum = arithmeticService.calculateSum(arrayInteger);
        int product = arithmeticService.calculateProduct(arrayInteger);
        printRandom.printResultWorkWithNumbers(arrayInteger, sum, product);
    }
}
