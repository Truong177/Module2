import java.time.LocalDate;

public class NextDayCalculator {
    public LocalDate calculateNextDay(LocalDate date) {
        return date.plusDays(1);
    }
}

