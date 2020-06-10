package com.buyalskaya.day2.parser;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateParser {
    private static final String CHECK_DATE = "(0?[1-9]|[12]\\d|3[01])[\\./](0?[1-9]|1[0-2])[\\./](\\d{4})";

    public Calendar dateParser(String date) {
        Pattern pattern = Pattern.compile(CHECK_DATE);
        Matcher matcher = pattern.matcher(date);
        matcher.find();
        int year = Integer.parseInt(matcher.group(3));
        int month = Integer.parseInt(matcher.group(2)) - 1; //months are numbered from 0
        int day = Integer.parseInt(matcher.group(1));
        Calendar calendar = new GregorianCalendar(year, month, day);
        return calendar;

    }
}
