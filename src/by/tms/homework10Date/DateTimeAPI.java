package by.tms.homework10Date;

import java.time.*;
import java.time.temporal.ChronoUnit;

public final class DateTimeAPI {

    private DateTimeAPI() {
    }

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate date2020 = LocalDate.of(2020, 6, 25);
        long daysBetweenDates = ChronoUnit.DAYS.between(nowDate, date2020);
        long secondsBetweenDates = ChronoUnit.SECONDS.between(date2020.atTime(LocalTime.MIDNIGHT), nowDate.atTime(LocalTime.MIDNIGHT));
        System.out.println("Количество дней между датами: " + getQuantityDays(nowDate, date2020));
        System.out.println("Количество дней между датами: " + daysBetweenDates);
        System.out.println("Количество секунд между датами: " + Duration.ofDays(getQuantityDays(nowDate, date2020)).getSeconds());
        System.out.println("Количество секунд между датами: " + secondsBetweenDates);

    }

    public static int getQuantityDays(LocalDate now, LocalDate then) {
        int quantityDays;
        return quantityDays = now.getDayOfYear() + (then.lengthOfYear() - then.getDayOfYear());
    }
}
