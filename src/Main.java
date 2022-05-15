public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int amount1 = 1_000_000;
        double rate1 = 9.99;
        int period1 = 1;
        System.out.println("Ежемесячный платеж для суммы " + amount1 + " рублей, " + "ставки " + rate1 +
                "% и периода " + period1 + " год(а) - " + service.calculate(amount1, rate1, period1) + " рублей");

        int amount2 = 1_000_000;
        double rate2 = 9.99;
        int period2 = 2;
        System.out.println("Ежемесячный платеж для суммы " + amount2 + " рублей, " + "ставки " + rate2 +
                "% и периода " + period2 + " год(а) - " + service.calculate(amount2, rate2, period2) + " рублей");

        int amount3 = 1_000_000;
        double rate3 = 9.99;
        int period3 = 3;
        System.out.println("Ежемесячный платеж для суммы " + amount3 + " рублей, " + "ставки " + rate3 +
                "% и периода " + period3 + " год(а) - " + service.calculate(amount3, rate3, period3) + " рублей");
    }
}
