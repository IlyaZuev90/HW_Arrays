package ru.netology.stats;

public class StatsService {
    public int summSales(int[] sales) {
        int summ = 0; // переменная в которую будут суммироваться значения

        for (int t : sales) {
            summ = summ + t;
        }
        return summ;
    }

    public int averageSalesPerMonth(int[] sales) {

        int summAverage = 0; // переменная в которую будут суммироваться значения

        for (int t : sales) {
            summAverage = summAverage + t;
        }
        return summAverage / sales.length;
    }

    public int maxSalesMonth(int[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж, больше
                maxMonth = i; // запомним его как макисмальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSalesMonth(int[] sales) {
        int minMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж, меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int amountOfMonthsWithSalesBelowAverage(int[] sales) {
        int averageSales = averageSalesPerMonth(sales); // устанавливаем значение переменной с отсылкой на метод, рассчитывающий средние продажи

        int amountOfMonths = 0; // переменная-счётчик для подсчёта кол-ва месяцев, соответствующих условию

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) { // значит, в рассматриваемом i-м месяце продаж, меньше, чем в среднем за год
                amountOfMonths = amountOfMonths + 1; // изменяем счётчик, если выполнены условия
            }
        }

        return amountOfMonths;
    }

    public int amountOfMonthsWithSalesAboveAverage(int[] sales) {
        int averageSales = averageSalesPerMonth(sales); // устанавливаем значение переменной с отсылкой на метод, рассчитывающий средние продажи

        int amountOfMonths = 0; // переменная-счётчик для подсчёта кол-ва месяцев, соответствующих условию

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) { // значит, в рассматриваемом i-м месяце продаж, ,больше, чем в среднем за год
                amountOfMonths = amountOfMonths + 1; // изменяем счётчик, если выполнены условия
            }
        }

        return amountOfMonths;
    }
}


