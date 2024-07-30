public class Logger {

    // Private static instance of the same class
    private static Logger instance;

    // Private constructor to prevent instantiation from outside
    private Logger() {
        // Optional: Add initialization code here
    }

    // Public static method to get the instance of the Singleton class
    public static Logger getInstance() {
        // Create the instance if it does not exist yet
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Other methods for logging
    public void log(String message) {
        System.out.println(message);
    }
}
