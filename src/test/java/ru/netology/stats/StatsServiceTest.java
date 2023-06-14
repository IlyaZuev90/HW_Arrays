package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void summCheck() {
        StatsService service = new StatsService();

        int[] sales = {1, 1, 1, 0, 1, 1};

        int expectedSumm = 5;
        int actualSumm = service.summSales(sales);

        Assertions.assertEquals(expectedSumm, actualSumm);
        if (expectedSumm == actualSumm) {
            System.out.println();
            System.out.println(expectedSumm + " == " + actualSumm);
            System.out.println();
        }

    }

    @Test
    public void averageSalesPerMonthCheck() {
        StatsService service = new StatsService();

        int[] sales = {0, 1, 2, 3, 4, 5};

        int expectedAverageSales = 2;
        int actualAverageSales = service.averageSalesPerMonth(sales);

        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
        if (expectedAverageSales == actualAverageSales) {
            System.out.println();
            System.out.println(expectedAverageSales + " == " + actualAverageSales);
            System.out.println();
        }
    }

    @Test
    public void maxSalesMonthCheck() {
        StatsService service = new StatsService();

        int[] sales = {-1, 0, 1, 2, 3, 4, 5, 5, 1, 1, 1, 5};

        int expectedMaxSalesMonth = 12;
        int actualMaxSalesMonth = service.maxSalesMonth(sales);

        Assertions.assertEquals(expectedMaxSalesMonth, actualMaxSalesMonth);
        if (expectedMaxSalesMonth == actualMaxSalesMonth) {
            System.out.println();
            System.out.println(expectedMaxSalesMonth + " == " + actualMaxSalesMonth);
            System.out.println();
        }
    }

    @Test
    public void minSalesMonthCheck() {
        StatsService service = new StatsService();

        int[] sales = {-1, 0, 1, 2, 3, 4, 5, 5, 1, 1, 1, 5};

        int expectedMinSalesMonth = 1;
        int actualMinSalesMonth = service.minSalesMonth(sales);

        Assertions.assertEquals(expectedMinSalesMonth, actualMinSalesMonth);
        if (expectedMinSalesMonth == actualMinSalesMonth) {
            System.out.println();
            System.out.println(expectedMinSalesMonth + " == " + actualMinSalesMonth);
            System.out.println();
        }
    }

    @Test
    public void amountOfMonthsWithSalesBelowAverageCheck() {
        StatsService service = new StatsService();

        int[] sales = {-1, 0, 1, 2, 3, 4, 5, 5, 1, 1, 1, 5};

        int expectedAmount = 6;
        int actualAmount = service.amountOfMonthsWithSalesBelowAverage(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
        if (expectedAmount == actualAmount) {
            System.out.println();
            System.out.println(expectedAmount + " == " + actualAmount);
            System.out.println();
        }
    }

    @Test
    public void amountOfMonthsWithSalesAboveAverageCheck() {
        StatsService service = new StatsService();

        int[] sales = {-1, 0, 1, 2, 3, 4, 5, 5, 1, 1, 1, 5};

        int expectedAmount = 5;
        int actualAmount = service.amountOfMonthsWithSalesAboveAverage(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
        if (expectedAmount == actualAmount) {
            System.out.println();
            System.out.println(expectedAmount + " == " + actualAmount);
            System.out.println();
        }
    }

}
