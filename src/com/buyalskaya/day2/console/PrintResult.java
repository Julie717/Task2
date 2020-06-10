package com.buyalskaya.day2.console;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class PrintResult {
    public static final String CONGRATULATION = "Happy birthday!!!\n";
    public static final String WARNING_INCORRECT_YEAR = "You weren't born yet\n";
    public static final String DATE_TIME_FORMAT = "dd MMMM yyyy HH:mm:ss";
    public static final String DATE_FORMAT = "dd MMMM yyyy";

    public void printRandom(int[] arrayRandom, boolean isNewline) {
        int size = arrayRandom.length;
        String formatPrint = "%4d";
        if (isNewline) {
            formatPrint = formatPrint + "\n";
        }
        for (int i = 0; i < size; i++) {
            System.console().printf(formatPrint, arrayRandom[i]);
        }
    }

    public void printResultWorkWithNumbers(int[] arrayNumber, int sum, int product) {
        int size = arrayNumber.length;
        StringBuilder printFormat = new StringBuilder("Numbers is {");
        for (int i = 0; i < size - 1; i++) {
            printFormat.append(arrayNumber[i]);
            printFormat.append(", ");
        }
        printFormat.append(arrayNumber[size - 1]);
        printFormat.append("}\nSum =  %d\nProduct = %d");
        System.console().printf(printFormat.toString(), sum, product);
    }

    public void printDeadline(String surname, Date deadline) {
        DateFormat dateFormat = new SimpleDateFormat(DATE_TIME_FORMAT, Locale.ENGLISH);
        System.console().printf("%s solve problem to %s\n", surname, dateFormat.format(deadline));
    }

    public void printDayWeek(Calendar date, String dayOfWeek) {
        DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT, Locale.ENGLISH);
        System.console().printf("%s is %s\n", dateFormat.format(date.getTime()), dayOfWeek);
    }

    public void printAge(int age) {
        if (age >= 0) {
            System.console().printf("Age = %d\n", age);
        } else {
            System.console().printf(WARNING_INCORRECT_YEAR);
        }
    }

    public void printCongratulation(boolean isBirthday) {
        if (isBirthday) {
            System.console().printf(CONGRATULATION);
        }
    }
}

