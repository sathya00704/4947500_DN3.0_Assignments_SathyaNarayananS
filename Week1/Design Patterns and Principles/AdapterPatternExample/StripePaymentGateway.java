// StripePaymentGateway.java
public class StripePaymentGateway {

    public void createPayment(double amountInCents) {
        System.out.println("Payment of $" + (amountInCents / 100.0) + " processed via Stripe.");
    }
}
