public class DecoratorPatternTest {

    public static void main(String[] args) {
        // Create a basic email notifier
        Notifier basicEmailNotifier = new EmailNotifier();

        // Decorate with SMS functionality
        Notifier smsEmailNotifier = new SMSNotifierDecorator(basicEmailNotifier);

        // Decorate with Slack functionality
        Notifier smsSlackEmailNotifier = new SlackNotifierDecorator(smsEmailNotifier);

        // Send notifications
        smsSlackEmailNotifier.send("Hello, this is a multi-channel notification!");
    }
}
