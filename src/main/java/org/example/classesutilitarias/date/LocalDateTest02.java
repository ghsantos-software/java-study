package org.example.classesutilitarias.date;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

// versão mais nova
public class LocalDateTest02 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate date = LocalDate.of(1990, 1, 27);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear()); // se é bisexto
        System.out.println(date.get(ChronoField.YEAR_OF_ERA));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date);
    }
}
