package org.data.dateTime;

import java.time.*;
import java.time.format.*;
import java.time.temporal.*;
import java.util.*;

/**
 * Demonstrates the modern Java date/time API ({@code java.time}).
 * Each static method performs exactly one operation.
 */
public class DateTimeOperations {
    
    /** Returns today's date in the system timezone. */
    public static LocalDate today() {
        return LocalDate.now();
    }

    /** Creates a LocalDate from year, month, day. */
    public static LocalDate ofDate(int year, Month month, int day) {
        return LocalDate.of(year, month, day);
    }

    /** Parses a date string in ISO format (yyyy-MM-dd). */
    public static LocalDate parseDate(String text) {
        return LocalDate.parse(text);
    }

    /** Returns the date one week from now. */
    public static LocalDate nextWeek() {
        return LocalDate.now().plusWeeks(1);
    }

    /** Subtracts three months from the given date. */
    public static LocalDate minusMonths(LocalDate date, long months) {
        return date.minusMonths(months);
    }

    /** Checks if a date is before another date. */
    public static boolean isBefore(LocalDate first, LocalDate second) {
        return first.isBefore(second);
    }

    /** Returns the day of week of a date. */
    public static DayOfWeek dayOfWeek(LocalDate date) {
        return date.getDayOfWeek();
    }

    /** Returns the number of days between two dates (as a long). */
    public static long daysBetween(LocalDate start, LocalDate end) {
        return ChronoUnit.DAYS.between(start, end);
    }

    /** Returns current time (system clock). */
    public static LocalTime nowTime() {
        return LocalTime.now();
    }

    /** Creates a LocalTime from hour, minute, second. */
    public static LocalTime ofTime(int hour, int minute, int second) {
        return LocalTime.of(hour, minute, second);
    }

    /** Parses a time string (HH:mm:ss). */
    public static LocalTime parseTime(String text) {
        return LocalTime.parse(text);
    }

    /** Adds two hours to the given time. */
    public static LocalTime plusHours(LocalTime time, long hours) {
        return time.plusHours(hours);
    }

    /** Compares two times (returns true if first is after second). */
    public static boolean isAfter(LocalTime first, LocalTime second) {
        return first.isAfter(second);
    }

    /** Returns current date and time. */
    public static LocalDateTime nowDateTime() {
        return LocalDateTime.now();
    }

    /** Combines a date and a time. */
    public static LocalDateTime ofDateTime(LocalDate date, LocalTime time) {
        return LocalDateTime.of(date, time);
    }

    /** Parses a date-time string (yyyy-MM-ddTHH:mm:ss). */
    public static LocalDateTime parseDateTime(String text) {
        return LocalDateTime.parse(text);
    }

    /** Adds one day and 30 minutes to the date-time. */
    public static LocalDateTime plusDayAndMinutes(LocalDateTime dt) {
        return dt.plusDays(1).plusMinutes(30);
    }

    /** Extracts the LocalDate part from a LocalDateTime. */
    public static LocalDate datePart(LocalDateTime dt) {
        return dt.toLocalDate();
    }

    /** Extracts the LocalTime part from a LocalDateTime. */
    public static LocalTime timePart(LocalDateTime dt) {
        return dt.toLocalTime();
    }

    /** Returns current date-time in the system timezone. */
    public static ZonedDateTime nowZoned() {
        return ZonedDateTime.now();
    }

    /** Creates a ZonedDateTime from a LocalDateTime and a ZoneId. */
    public static ZonedDateTime ofZoned(LocalDateTime dt, ZoneId zone) {
        return ZonedDateTime.of(dt, zone);
    }

    /** Converts a ZonedDateTime to another timezone (America/New_York). */
    public static ZonedDateTime switchZone(ZonedDateTime zdt, ZoneId targetZone) {
        return zdt.withZoneSameInstant(targetZone);
    }

    /** Shows the offset (e.g., +03:00) of a ZonedDateTime. */
    public static ZoneOffset offset(ZonedDateTime zdt) {
        return zdt.getOffset();
    }

    /** Returns the zone (e.g., Europe/Moscow) of a ZonedDateTime. */
    public static ZoneId zone(ZonedDateTime zdt) {
        return zdt.getZone();
    }

    /** Returns current instant from the system clock. */
    public static Instant nowInstant() {
        return Instant.now();
    }

    /** Creates an Instant from epoch seconds. */
    public static Instant fromEpochSecond(long seconds) {
        return Instant.ofEpochSecond(seconds);
    }

    /** Adds a Duration to an Instant. */
    public static Instant plusDuration(Instant instant, Duration d) {
        return instant.plus(d);
    }

    /** Converts a ZonedDateTime to an Instant. */
    public static Instant fromZoned(ZonedDateTime zdt) {
        return zdt.toInstant();
    }

    /** Creates a Duration of 30 minutes. */
    public static Duration durationOfMinutes(long minutes) {
        return Duration.ofMinutes(minutes);
    }

    /** Calculates the Duration between two temporal values. */
    public static Duration betweenTimes(LocalTime start, LocalTime end) {
        return Duration.between(start, end);
    }

    /** Adds a Duration to a LocalTime. */
    public static LocalTime addDuration(LocalTime time, Duration d) {
        return time.plus(d);
    }

    /** Creates a Period of 1 year and 2 months. */
    public static Period periodOfYearsAndMonths(int years, int months) {
        return Period.ofYears(years).plusMonths(months);
    }

    /** Calculates the Period between two LocalDates. */
    public static Period betweenDates(LocalDate start, LocalDate end) {
        return Period.between(start, end);
    }

    /** Adds a Period to a LocalDate. */
    public static LocalDate addPeriod(LocalDate date, Period p) {
        return date.plus(p);
    }

    /** Formats a LocalDateTime using ISO format. */
    public static String formatIso(LocalDateTime dt) {
        return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(dt);
    }

    /** Formats a LocalDate with a custom pattern (e.g., dd.MM.yyyy). */
    public static String formatCustom(LocalDate date, String pattern) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern(pattern);
        return date.format(fmt);
    }

    /** Parses a string with a custom pattern into a LocalDate. */
    public static LocalDate parseCustom(String text, String pattern) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern(pattern);
        return LocalDate.parse(text, fmt);
    }

    /** Formats a ZonedDateTime with a locale‑specific format. */
    public static String formatZoned(ZonedDateTime zdt) {
        DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        return zdt.format(fmt);
    }
}
