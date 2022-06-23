public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int myMonthlyPay = service.calculate(1_000_000, 12, 9.99);
        System.out.println(myMonthlyPay);

        myMonthlyPay = service.calculate(1_000_000, 24, 9.99);
        System.out.println(myMonthlyPay);

        myMonthlyPay = service.calculate(1_000_000, 36, 9.99);
        System.out.println(myMonthlyPay);
    }
}
