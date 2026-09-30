package org.example.classesutilitarias.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

// instant usa zulu time
public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
        System.out.println(Instant.ofEpochSecond(3, 0));
    }
}
