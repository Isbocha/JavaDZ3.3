public class CreditPaymentService {
    public int credit(double amount, double percent, double month) {
        double percentMonth = percent / 12 / 100;
        double percentDegree = Math.pow((1 + percentMonth), month);
        double formula = amount * (percentMonth * percentDegree) / (percentDegree - 1);
        int payment = (int) formula;
        return payment;
    }
}
