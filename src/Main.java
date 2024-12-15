public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService ();
        int credit = 1_000_000; // сумма кредита в руб.
        int period = 12; // срок кредита в месяцах
        double percent = 9.99; // годовая процентная ставка
        int payment = service.calculate(credit, period, percent); // ежемесячный платёж по кредиту в руб.
        System.out.println("Ежемесячный платёж по кредиту на срок 1 год: " + payment + " руб.");

        System.out.println();
        System.out.println("Ежемесячный платёж по крдиту на срок 2 года: " + service.calculate(1_000_000, 24, 9.99) + " руб.");

        System.out.println();
        System.out.println("Ежемесячный платёж по крдиту на срок 3 года: " + service.calculate(1_000_000, 36, 9.99) + " руб.");
    }
}
