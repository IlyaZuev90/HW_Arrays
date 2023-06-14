import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {

        StatsService service = new StatsService();

        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        System.out.println("Суммарные продажи за 12 месяцев: " + service.summSales(sales));
        System.out.println("");
        System.out.println("Средние продажи за 12 месяцев: " + service.averageSalesPerMonth(sales));
        System.out.println("");
        System.out.println("Номер месяца с максимальными продажами за 12 месяцев: " + service.maxSalesMonth(sales));
        System.out.println("");
        System.out.println("Номер месяца с минимальными продажами за 12 месяцев: " + service.minSalesMonth(sales));
        System.out.println("");
        System.out.println("Кол-во месяцев с продажами ниже среднего показателя за год: " + service.amountOfMonthsWithSalesBelowAverage(sales));
        System.out.println("");
        System.out.println("Кол-во месяцев с продажами выше среднего показателя за год: " + service.amountOfMonthsWithSalesAboveAverage(sales));
        System.out.println("");
    }
}
