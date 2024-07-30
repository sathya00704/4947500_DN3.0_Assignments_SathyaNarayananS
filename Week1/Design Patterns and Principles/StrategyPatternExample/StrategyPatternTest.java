public class StrategyPatternTest {

    public static void main(String[] args) {
        // Create payment contexts with different strategies
        PaymentContext context1 = new PaymentContext(new CreditCardPayment("1234 5678 9012 3456", "12/23", "123"));
        PaymentContext context2 = new PaymentContext(new PayPalPayment("example@example.com", "password123"));

        // Execute payments
        context1.executePayment(100.0);
        System.out.println();

        context2.executePayment(50.0);
    }
}
