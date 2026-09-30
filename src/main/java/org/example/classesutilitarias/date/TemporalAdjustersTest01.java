package org.example.classesutilitarias.date;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

// with realiza uma alteração absoluta (substituição), enquanto o plus realiza uma alteração relativa (adição)
public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        // now = now.withDayOfMonth(20); mesma coisa da linha de baixo, dois modos diferentes
        now = now.with(ChronoField.DAY_OF_MONTH, 30);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)); // mostra quando vai ser a próxima sexta do mês
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY)); // mostra quando vai ser a próxima sexta do mês
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.WEDNESDAY)); // mostra quando foi a ultima quarta
        System.out.println(now);
        System.out.println(now.getDayOfWeek());




    }
}
