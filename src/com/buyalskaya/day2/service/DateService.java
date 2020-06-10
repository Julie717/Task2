package com.buyalskaya.day2.service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateService {
    public Date calculateDeadline(int amountOfWorkDay) {
        Calendar dateNow = new GregorianCalendar();
        dateNow.add(Calendar.DAY_OF_MONTH, amountOfWorkDay);
        return dateNow.getTime();
    }

    public String calculateDayWeek(Calendar calendar) {
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG_STANDALONE, Locale.ENGLISH);
    }

    public int calculateAge(Calendar birthday) {
        Calendar dateNow = new GregorianCalendar();
        int yearBirthday = birthday.get(Calendar.YEAR);
        int yearNow = dateNow.get(Calendar.YEAR);
        int age = yearNow - yearBirthday;
        return age;
    }

    public boolean isTodayBirthday(Calendar birthday) {
        int dayBirthday = birthday.get(Calendar.DAY_OF_MONTH);
        int monthBirthday = birthday.get(Calendar.MONTH);
        int yearBirthday = birthday.get(Calendar.YEAR);
        Calendar dateNow = new GregorianCalendar();
        int dayNow = dateNow.get(Calendar.DAY_OF_MONTH);
        int monthNow = dateNow.get(Calendar.MONTH);
        int yearNow = dateNow.get(Calendar.YEAR);
        return (monthNow == monthBirthday && dayNow == dayBirthday &&
                yearBirthday <= yearNow);

    }
}
