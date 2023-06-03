// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int result = service.credit(1_000_000, 9.99, 36);
        System.out.println("Сумма аннуитетного платежа составляет: " + result + " рублей");
    }
}