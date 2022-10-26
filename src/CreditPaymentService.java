public class CreditPaymentService {
    public double calculate(double c, double p, double m) {
        // с - сумма кредита, р - процентная ставка, m - кол-во месяцев
        double payment; // платеж
        double percent = p / 12 / 100; // месячная процентная ставка
        double kef; // коэффициент аннуитета
        double x; // возведение в степень 1 + percent
        x = Math.pow((1 + percent), m);
        kef = percent * x / (x - 1);
        payment = kef * c;
        return payment;
    }
}
