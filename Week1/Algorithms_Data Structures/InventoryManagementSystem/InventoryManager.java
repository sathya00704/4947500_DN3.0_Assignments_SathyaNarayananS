import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<Integer, Product> inventory;

    public InventoryManager() {
        this.inventory = new HashMap<>();
    }

    // Method to add a product to inventory
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    // Method to update product details
    public void updateProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            inventory.put(product.getProductId(), product);
        } else {
            System.out.println("Product not found in inventory.");
        }
    }

    // Method to delete a product from inventory
    public void deleteProduct(int productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
        } else {
            System.out.println("Product not found in inventory.");
        }
    }

    // Method to print all products in inventory
    public void printInventory() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Adding some sample products
        manager.addProduct(new Product(1, "Laptop", 10, 899.99));
        manager.addProduct(new Product(2, "Mouse", 50, 19.99));
        manager.addProduct(new Product(3, "Keyboard", 20, 49.99));

        // Printing initial inventory
        System.out.println("Initial Inventory:");
        manager.printInventory();

        // Updating product quantity
        manager.updateProduct(new Product(2, "Mouse", 40, 19.99));

        // Printing updated inventory
        System.out.println("\nInventory after update:");
        manager.printInventory();

        // Deleting a product
        manager.deleteProduct(3);

        // Printing inventory after deletion
        System.out.println("\nInventory after deletion:");
        manager.printInventory();
    }
}
