package org.example.classesutilitarias.date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String,String> zoneIdMap = ZoneId.SHORT_IDS;
        System.out.println(zoneIdMap);
        System.out.println(ZoneId.systemDefault());
        ZoneId TokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(TokyoZone);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = now.atZone(TokyoZone);
        System.out.println(zonedDateTime);

        Instant instant = Instant.now();
        System.out.println(instant);
        ZonedDateTime zonedDateTime1 = instant.atZone(TokyoZone);
        System.out.println(zonedDateTime1);

    }
}
