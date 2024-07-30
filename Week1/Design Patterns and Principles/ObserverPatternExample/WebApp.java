// WebApp.java
public class WebApp implements Observer {

    private String appName;

    public WebApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(double price) {
        System.out.println("Web App " + appName + " received update: New Price = $" + price);
    }
}
