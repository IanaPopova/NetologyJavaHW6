package ru.netology.NetologyJavaHW6.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldShowMinSalesDay() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMinDay = 9;
        long actualMinDay = service.minSales(sales);

        Assertions.assertEquals(expectedMinDay, actualMinDay);
    }

    @Test
    public void shouldShowMaxSalesDay() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMaxDay = 8;
        long actualMaxDay = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxDay, actualMaxDay);
    }

    @Test
    public void shouldShowTotalAmountOfSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedTotalAmount = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actualTotalAmount = service.getTotalAmountOfSales(sales);

        Assertions.assertEquals(expectedTotalAmount, actualTotalAmount);
    }

@Test
public void shouldShowAverageSales() {
    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    long expectedAverageSales = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
    long actualAverageSales = service.getAverageSales(sales);

    Assertions.assertEquals(expectedAverageSales, actualAverageSales);
}

    @Test
    public void shouldShowBelowAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedBelowAverageSales = 5;
        long actualBelowAverageSales = service.getAmountOfMonthsBelowAverage(sales);

        Assertions.assertEquals(expectedBelowAverageSales, actualBelowAverageSales);
    }

    @Test
    public void shouldShowAboveAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAboveAverageSales = 5;
        long actualAboveAverageSales = service.getAmountOfMonthsAboveAverage(sales);

        Assertions.assertEquals(expectedAboveAverageSales, actualAboveAverageSales);
    }

}
