public class AdapterPatternTest {

    public static void main(String[] args) {
        // Using PayPal via adapter
        PayPalPaymentGateway paypalGateway = new PayPalPaymentGateway();
        PaymentProcessor paypalAdapter = new PayPalAdapter(paypalGateway);
        paypalAdapter.processPayment(100.50);

        System.out.println();

        // Using Stripe via adapter
        StripePaymentGateway stripeGateway = new StripePaymentGateway();
        PaymentProcessor stripeAdapter = new StripeAdapter(stripeGateway);
        stripeAdapter.processPayment(75.25);
    }
}
