package com.buyalskaya.day2.parser;

public class NumberParser {
    public int[] integerParser(String[] arrayNumber) {
        int size = arrayNumber.length;
        int[] arrayInteger = new int[size];
        for (int i = 0; i < size; i++) {
            arrayInteger[i]=Integer.parseInt(arrayNumber[i]);
        }
        return arrayInteger;
    }
}
