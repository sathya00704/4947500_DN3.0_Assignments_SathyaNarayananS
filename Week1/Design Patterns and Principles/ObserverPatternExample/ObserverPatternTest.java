public class ObserverPatternTest {

    public static void main(String[] args) {
        // Create a stock market instance
        StockMarket stockMarket = new StockMarket();

        // Create observers
        Observer mobileApp1 = new MobileApp("MobileApp1");
        Observer mobileApp2 = new MobileApp("MobileApp2");
        Observer webApp1 = new WebApp("WebApp1");

        // Register observers
        stockMarket.register(mobileApp1);
        stockMarket.register(mobileApp2);
        stockMarket.register(webApp1);

        // Simulate stock price changes and notify observers
        stockMarket.setPrice(150.50);
        System.out.println();

        stockMarket.setPrice(155.75);
        System.out.println();

        // Deregister an observer
        stockMarket.deregister(mobileApp2);

        stockMarket.setPrice(160.25);
    }
}
