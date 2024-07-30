// EmailNotifier.java
public class EmailNotifier implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("Sending email notification: " + message);
        // Actual email sending logic would be implemented here
    }
}
