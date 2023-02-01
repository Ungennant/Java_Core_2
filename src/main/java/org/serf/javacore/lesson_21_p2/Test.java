package org.serf.javacore.lesson_21_p2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Test {
    public static void main(String[] args) {

        Date date = new Date();
        DateTimeConverter converter = new DateTimeConverter();

        LocalDate localDate = converter.convertToLocalDateViaInstant(date);
        LocalTime localTime = converter.convertToLocalTimeViaInstant(date);
        LocalDateTime localDateTime = converter.convertToLocalDateTimeViaInstant(date);

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

    }
}
