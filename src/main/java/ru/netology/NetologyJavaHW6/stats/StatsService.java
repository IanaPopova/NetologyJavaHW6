package ru.netology.NetologyJavaHW6.stats;


public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }


    public long getTotalAmountOfSales (long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public long getAverageSales(long[] sales) {
        return getTotalAmountOfSales(sales)/sales.length;
    }

    public int getAmountOfMonthsBelowAverage(long[] sales) {
        int belowAverage = 0;

        for (long sale : sales) {
            if (sale < getTotalAmountOfSales(sales) / sales.length) {
                belowAverage++;
            }
        }
        return belowAverage;
    }

    public int getAmountOfMonthsAboveAverage(long[] sales) {
        int aboveAverage = 0;

        for (long sale : sales) {
            if (sale > getTotalAmountOfSales(sales) / sales.length) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }
}