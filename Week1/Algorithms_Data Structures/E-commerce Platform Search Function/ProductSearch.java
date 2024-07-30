import java.util.Arrays;

public class ProductSearch {

    // Linear search on an unsorted array
    public static Product linearSearch(Product[] products, int targetProductId) {
        for (Product product : products) {
            if (product.getProductId() == targetProductId) {
                return product;
            }
        }
        return null; // Product not found
    }

    // Binary search on a sorted array
    public static Product binarySearch(Product[] products, int targetProductId) {
        Arrays.sort(products, (p1, p2) -> Integer.compare(p1.getProductId(), p2.getProductId())); // Sorting for binary search

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (products[mid].getProductId() == targetProductId) {
                return products[mid];
            } else if (products[mid].getProductId() < targetProductId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null; // Product not found
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(205, "Shoes", "Fashion"),
                new Product(307, "Book", "Books"),
                new Product(412, "Headphones", "Electronics"),
                new Product(524, "T-shirt", "Fashion")
        };

        int targetProductId = 307;

        // Perform linear search
        System.out.println("Performing linear search...");
        Product resultLinear = linearSearch(products, targetProductId);
        if (resultLinear != null) {
            System.out.println("Linear Search Result: " + resultLinear.getProductName());
        } else {
            System.out.println("Product with ID " + targetProductId + " not found (Linear Search).");
        }

        // Perform binary search
        System.out.println("\nPerforming binary search...");
        Product resultBinary = binarySearch(products, targetProductId);
        if (resultBinary != null) {
            System.out.println("Binary Search Result: " + resultBinary.getProductName());
        } else {
            System.out.println("Product with ID " + targetProductId + " not found (Binary Search).");
        }
    }
}
