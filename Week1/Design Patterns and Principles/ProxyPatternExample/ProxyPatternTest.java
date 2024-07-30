public class ProxyPatternTest {

    public static void main(String[] args) {
        // Create a proxy image (lazy loading)
        Image image1 = new ProxyImage("image1.jpg");

        // Image will be loaded from disk
        image1.display();
        System.out.println();

        // Image will be loaded from cache (no real loading)
        image1.display();
        System.out.println();

        // Create another proxy image (lazy loading)
        Image image2 = new ProxyImage("image2.png");

        // Image will be loaded from disk
        image2.display();
        System.out.println();

        // Image will be loaded from cache (no real loading)
        image2.display();
    }
}
