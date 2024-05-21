import static org.junit.Assert.assertEquals;
import java.time.LocalDate;
import org.junit.Test;

public class NextDayCalculatorTest {
    @Test
    public void testCalculateNextDay_1_1_2018() {
        NextDayCalculator calculator = new NextDayCalculator();
        LocalDate date = LocalDate.of(2018, 1, 1);
        LocalDate nextDay = calculator.calculateNextDay(date);
        assertEquals(LocalDate.of(2018, 1, 2), nextDay);
    }

    @Test
    public void testCalculateNextDay_31_1_2018() {
        NextDayCalculator calculator = new NextDayCalculator();
        LocalDate date = LocalDate.of(2018, 1, 31);
        LocalDate nextDay = calculator.calculateNextDay(date);
        assertEquals(LocalDate.of(2018, 2, 1), nextDay);
    }

    @Test
    public void testCalculateNextDay_30_4_2018() {
        NextDayCalculator calculator = new NextDayCalculator();
        LocalDate date = LocalDate.of(2018, 4, 30);
        LocalDate nextDay = calculator.calculateNextDay(date);
        assertEquals(LocalDate.of(2018, 5, 1), nextDay);
    }

    @Test
    public void testCalculateNextDay_28_2_2018() {
        NextDayCalculator calculator = new NextDayCalculator();
        LocalDate date = LocalDate.of(2018, 2, 28);
        LocalDate nextDay = calculator.calculateNextDay(date);
        assertEquals(LocalDate.of(2018, 3, 1), nextDay);
    }

    @Test
    public void testCalculateNextDay_29_2_2020() {
        NextDayCalculator calculator = new NextDayCalculator();
        LocalDate date = LocalDate.of(2020, 2, 29);
        LocalDate nextDay = calculator.calculateNextDay(date);
        assertEquals(LocalDate.of(2020, 3, 1), nextDay);
    }

    @Test
    public void testCalculateNextDay_31_12_2018() {
        NextDayCalculator calculator = new NextDayCalculator();
        LocalDate date = LocalDate.of(2018, 12, 31);
        LocalDate nextDay = calculator.calculateNextDay(date);
        assertEquals(LocalDate.of(2019, 1, 1), nextDay);
    }
}
