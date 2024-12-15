public class CreditPaymentService {

    public int calculate (int credit, int period, double percent) {
        double percentMonth =  percent / 100 / 12; // месячная процентная ставка
        double coefficient =  (percentMonth * Math.pow(1 + percentMonth, period)) / (Math.pow(1 + percentMonth, period) - 1); // коэффициент аннуитета
        double payment = credit * coefficient; // ежемесячный платёж в руб.
        int result;
        result = (int) payment;
        return result;
    }

}
