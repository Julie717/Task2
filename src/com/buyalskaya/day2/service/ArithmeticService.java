package com.buyalskaya.day2.service;

public class ArithmeticService {
    public static final int LEFT_BORDER = -40;
    public static final int RIGHT_BORDER = 40;

    public int[] arrayRandom(int amountOfRandom) {
        int[] arrayRandom = new int[amountOfRandom];
        for (int i = 0; i < amountOfRandom; i++) {
            arrayRandom[i] = LEFT_BORDER + (int) (Math.random() * ((RIGHT_BORDER - LEFT_BORDER) + 1));
        }
        return arrayRandom;
    }

    public int calculateSum(int[] arrayNumber) {
        int sum = 0;
        for (int i = 0; i < arrayNumber.length; i++) {
            sum = sum + arrayNumber[i];
        }
        return sum;
    }

    public int calculateProduct(int[] arrayNumber) {
        int product = 1;
        for (int i = 0; i < arrayNumber.length; i++) {
            product = product * arrayNumber[i];
        }
        return product;
    }
}
