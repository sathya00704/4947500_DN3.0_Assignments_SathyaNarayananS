public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double presentValue, double growthRate, int periods) {
        // Base case: If no periods left, return present value
        if (periods == 0) {
            return presentValue;
        } else {
            // Recursive case: Calculate future value recursively
            return calculateFutureValue(presentValue * (1 + growthRate), growthRate, periods - 1);
        }
    }

    public static void main(String[] args) {
        double presentValue = 1000; // Initial investment or present value
        double growthRate = 0.05; // Growth rate per period (5%)
        int periods = 10; // Number of periods to forecast

        // Calculate future value recursively
        double futureValue = calculateFutureValue(presentValue, growthRate, periods);

        // Display the result
        System.out.printf("Future value after %d periods: %.2f%n", periods, futureValue);
    }
}
