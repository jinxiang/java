package com.hmmloo.javacodingproblems;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeTest {

    @Test
    public void printOut() {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(Period.of(2021, 11, 24));
        LocalDate startLocalDate = LocalDate.of(2018, 3, 12);
        LocalDate endLocalDate = LocalDate.of(2018, 7, 20);
        System.out.println(Period.between(startLocalDate, endLocalDate));
        System.out.println(Duration.ofHours(10));
//        System.out.println(ZoneId.getAvailableZoneIds());
        System.out.println(OffsetDateTime.now());
        System.out.println(ZonedDateTime.now());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Instant.now().atZone(ZoneId.of("Singapore")));
        System.out.println(Clock.systemUTC());
    }

    @Test
    public void date_range() {
        LocalDate startLocalDate = LocalDate.of(2019, 2, 1);
        LocalDate endLocalDate = LocalDate.of(2019, 2, 21);
        for (LocalDate date = startLocalDate;
             date.isBefore(endLocalDate); date = date.plusDays(1)) {
            // do something with this day
            System.out.println(date);
        }

        // JDK 9
        startLocalDate.datesUntil(endLocalDate).forEach(System.out::println);
        startLocalDate.datesUntil(endLocalDate, Period.ofWeeks(1)).forEach(System.out::println);

    }

    @Test
    public void calcuate_age() {
        LocalDate startLocalDate = LocalDate.of(1987, 11, 3);
        LocalDate endLocalDate = LocalDate.now();

        System.out.println(ChronoUnit.YEARS.between(startLocalDate, endLocalDate));
        System.out.println(Period.between(startLocalDate, endLocalDate));
        System.out.println();
        System.out.println();
        System.out.println();
    }

    @Test
    public void test_startOfADay() {
        LocalDate localDate = LocalDate.of(2019, 2, 28);
        LocalDateTime ldDayStart = localDate.atStartOfDay();
        assertEquals("2019-02-28T00:00", ldDayStart.toString());

    }

    @Test
    public void test_endOfADay() {
        LocalDate localDate = LocalDate.of(2019, 2, 28);
        LocalDateTime ldDayEnd = localDate.atTime(LocalTime.MAX);
        // LocalDateTime ldDayEnd = LocalTime.MAX.atDate(localDate);
        assertEquals("2019-02-28T23:59:59.999999999", ldDayEnd.toString());
    }

    @Test
    public void test_date_range() {
        LocalDate ld1 = LocalDate.of(2018, 1, 1);
        LocalDate ld2 = LocalDate.of(2019, 3, 1);
        System.out.println(Period.between(ld1, ld2));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    @Test
    public void test_clock() {
        System.out.println(Clock.fixed(Instant.now(), ZoneOffset.UTC));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }


}