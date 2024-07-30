import java.util.ArrayList;
import java.util.List;

// StockMarket.java
public class StockMarket implements Stock {

    private List<Observer> observers;
    private double price; // Example: current stock price

    public StockMarket() {
        this.observers = new ArrayList<>();
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }
}
