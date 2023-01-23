package ru.netology.satistics;

public class StatsService {

    public int amoutSales(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }return totalSum;
    }

    public  int averageSalesPerMonth(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }return totalSum / arr.length;
    }

    public  int maxSales(int[] arr) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : arr) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= arr[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }
    public  int minSales(int[] arr) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : arr) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= arr[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }
    public  int numberMonchsBelowAverage(int[] arr) {
        int avarage = averageSalesPerMonth(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avarage) {
                count++;
            }
        }return  count;
    }
    public  int numberMonchsAboveAverage(int[] arr) {
        int avarage = averageSalesPerMonth(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avarage) {
                count++;
            }
        }return  count;
    }

}

