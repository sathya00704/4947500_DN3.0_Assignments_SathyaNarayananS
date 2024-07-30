// CreditCardPayment.java
public class CreditCardPayment implements PaymentStrategy {

    private String cardNumber;
    private String expirationDate;
    private String cvv;

    public CreditCardPayment(String cardNumber, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " using Credit Card: " + cardNumber);
        // Actual payment logic using credit card would be implemented here
    }
}
