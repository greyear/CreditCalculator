public class CreditPaymentService {

    public int calculate(int amount, double rate, int period) {
        double monthlyRate = rate / 12 / 100;
        int minusPeriodInMonths = -period * 12;
        double paymentDouble = amount * monthlyRate / (1 - Math.pow(1 + monthlyRate, minusPeriodInMonths));
        int payment = (int) paymentDouble;
        return payment;
    }
}