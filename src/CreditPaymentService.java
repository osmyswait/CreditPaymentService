public class CreditPaymentService {
    public double calculate(double creditAmount, double interestRate, double months) {
        // creditAmount - сумма кредита, interestRate - процентная ставка, months - кол-во месяцев
        double payment; // платеж
        double monthlyInterestRate = interestRate / 12 / 100; // месячная процентная ставка
        double rate; // коэффициент аннуитета
        double interimSettlement; // промежуточный расчет, возведение в степень (1 + monthlyInterestRate)
        interimSettlement = Math.pow((1 + monthlyInterestRate), months);
        rate = monthlyInterestRate * interimSettlement / (interimSettlement - 1);
        payment = rate * creditAmount;
        return payment;
    }
}
