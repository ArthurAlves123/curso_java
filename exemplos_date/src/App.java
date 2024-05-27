import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) throws Exception {
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt04 = DateTimeFormatter.ISO_DATE_TIME;

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2024-06-16");
        LocalDate d05 = LocalDate.parse("24/05/2024", fmt01);
        LocalDateTime d06 = LocalDateTime.parse("24/05/2024 07:30", fmt02);
        LocalDate d07 = LocalDate.of(2024, 05, 16);
        LocalDateTime d08 = LocalDateTime.of(2024, 8, 16, 7, 31, 10);
        Instant d09 = Instant.parse("2024-05-16T08:30:26Z");
        LocalDate f1 = LocalDate.ofInstant(d09, ZoneId.systemDefault());

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05.format(fmt01));
        System.out.println(fmt01.format(d05));
        System.out.println(d06);
        System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(fmt03.format(d09));
        System.out.println(f1);
        System.out.println(d01.getDayOfMonth());

        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);
        System.out.println(pastWeekLocalDate);
        System.out.println(nextWeekLocalDate);

        Instant pastWeekInstant = d09.minus(7, ChronoUnit.DAYS);
        System.out.println(pastWeekInstant);

        Duration t1 = Duration.between(d01, d04);
        // System.out.println(t1);
    }
}
