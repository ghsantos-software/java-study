package org.example.classesutilitarias.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

// junção de hora e data
public class LocalDateTimeTeste01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("1990-12-01");
        LocalTime time = LocalTime.parse("09:45:00");
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);

        // retorna os dois juntos
        LocalDateTime ldtl = date.atTime(time);
        System.out.println(ldtl);

        LocalDateTime ldtl2 = time.atDate(date);
        System.out.println(ldtl2);
    }
}
