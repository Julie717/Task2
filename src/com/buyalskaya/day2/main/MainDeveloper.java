package com.buyalskaya.day2.main;

import com.buyalskaya.day2.console.PrintResult;
import com.buyalskaya.day2.service.DateService;

import java.util.Date;

public class MainDeveloper {
    public static void main(String[] args) {
        String surname = System.console().readLine("Enter a surname\n");
        String amountOfWorkDayString = System.console().readLine("Enter an amount of days to complete the work\n");
        int amountOfWorkDay = Integer.parseInt(amountOfWorkDayString);
        DateService dateService=new DateService();
        Date deadline=dateService.calculateDeadline(amountOfWorkDay);
        PrintResult printResult=new PrintResult();
        printResult.printDeadline(surname,deadline);
    }
}
