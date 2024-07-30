// MobileApp.java
public class MobileApp implements Observer {

    private String appName;

    public MobileApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(double price) {
        System.out.println("Mobile App " + appName + " received update: New Price = $" + price);
    }
}
