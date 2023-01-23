package ru.netology.satistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumOfSales() {
        StatsService service = new StatsService();

        int[]  arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.amoutSales(arr);

        Assertions.assertEquals(expectedSum,actualSum);

    }
    @Test
    public  void comprasionAverageAmount() {
        StatsService service = new StatsService();

        int[]  arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverage = 15;
        int actualAverage = service.averageSalesPerMonth(arr);

        Assertions.assertEquals(expectedAverage,actualAverage);
    }
    @Test
    public  void searchMaxAmount() {
        StatsService service = new StatsService();

        int[]  arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmount = 8;
        int actualAmount = service.maxSales(arr);

        Assertions.assertEquals(expectedAmount,actualAmount);

    }
    @Test
    public void searchMinAmount() {
        StatsService service = new StatsService();

        int[]  arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinAmount = 9;
        int actualMinAmount = service.minSales(arr);

        Assertions.assertEquals(expectedMinAmount,actualMinAmount);
    }
    @Test
    public  void  searchNumberMonthsBelowAverage() {
        StatsService service = new StatsService();

        int[]  arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCountMonths = 5;
        int actualCountMonths = service.numberMonchsBelowAverage(arr);

        Assertions.assertEquals(expectedCountMonths,actualCountMonths);

    }
    @Test
    public  void  searchNumberMonthsAboveAverage() {
        StatsService service = new StatsService();

        int[]  arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCountMonths = 5;
        int actualCountMonths = service.numberMonchsAboveAverage(arr);

        Assertions.assertEquals(expectedCountMonths,actualCountMonths);
    }
}
