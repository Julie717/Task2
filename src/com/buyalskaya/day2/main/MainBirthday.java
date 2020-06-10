package com.buyalskaya.day2.main;

import com.buyalskaya.day2.console.PrintResult;
import com.buyalskaya.day2.parser.DateParser;
import com.buyalskaya.day2.service.DateService;

import java.util.Calendar;

public class MainBirthday {
    public static void main(String[] args) {
        String birthday = System.console().readLine("Enter a birthday in format dd.mm.yyyy\n");
        DateParser dateParser = new DateParser();
        Calendar birthdayDate = dateParser.dateParser(birthday);
        DateService dateService = new DateService();
        PrintResult printResult = new PrintResult();
        String birthdayDayOfWeek = dateService.calculateDayWeek(birthdayDate);
        int age = dateService.calculateAge(birthdayDate);
        boolean isBirthday = dateService.isTodayBirthday(birthdayDate);
        printResult.printDayWeek(birthdayDate, birthdayDayOfWeek);
        printResult.printAge(age);
        printResult.printCongratulation(isBirthday);
    }
}
