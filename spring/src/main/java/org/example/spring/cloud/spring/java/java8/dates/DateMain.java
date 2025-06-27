package org.example.spring.cloud.spring.java.java8.dates;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateMain {
    public static void main(String[] args) {
        Date              dateLoc              = new Date();
        GregorianCalendar gregorianCalendarLoc = new GregorianCalendar();
        SimpleDateFormat  simpleDateFormatLoc  = new SimpleDateFormat();


        LocalTime localTimeLoc;
        LocalDate localDateLoc;
        LocalDateTime localDateTimeLoc = LocalDateTime.now()
                                                      .minusHours(2)
                                                      .minusMinutes(5);
        localDateTimeLoc.atZone(ZoneOffset.systemDefault())
                        .toInstant()
                        .toEpochMilli();

        Instant       instantLoc;
        Period        periodLoc;
        ZonedDateTime zonedDateTimeLoc = ZonedDateTime.now(ZoneId.of("Europe/Paris"));

        zonedDateTimeLoc.toInstant()
                        .toEpochMilli();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ");
    }
}
