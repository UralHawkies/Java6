public class CreditPaymentService {

    public int calculate(int creditAmount, double periodInMonths, double creditBet) {

        double betMonthlyPay;
        double x;
        double y;
        double annuRatio;
        betMonthlyPay = creditBet/periodInMonths/100;
        x = 1 + betMonthlyPay; // (1+коэффициент аннуитета)
        y = Math.pow (x , periodInMonths); //(1+коэффициент аннуитета в степени)
        annuRatio = betMonthlyPay * y / (y - 1);
        int monthlyPay = (int) (annuRatio * creditAmount);

        return monthlyPay;
    }
}
