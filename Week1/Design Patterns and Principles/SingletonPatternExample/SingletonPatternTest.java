public class SingletonPatternTest {

    public static void main(String[] args) {
        // Get the singleton instance
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Both logger1 and logger2 should be the same instance
        System.out.println("logger1 instance hashcode: " + System.identityHashCode(logger1));
        System.out.println("logger2 instance hashcode: " + System.identityHashCode(logger2));

        // Test logging
        logger1.log("Testing Logger singleton pattern");
        logger2.log("Singleton pattern ensures only one instance exists");

        // Additional test (optional): Ensure no new instances are created
        //Logger logger3 = new Logger(); // This should not compile due to private constructor
    }
}
