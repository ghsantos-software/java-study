package org.example.classesutilitarias.date;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1790690471420L);// long 100000
        date.setTime(System.currentTimeMillis());
        System.out.println(date);
    }
}
