public class OrderSorting {

    // Bubble Sort for sorting orders by totalPrice
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
                    // Swap orders[j] and orders[j+1]
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, then break
            if (!swapped) {
                break;
            }
        }
    }

    // Quick Sort for sorting orders by totalPrice
    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            // Partitioning index
            int pi = partition(orders, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    // Partition function for Quick Sort
    private static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].getTotalPrice();
        int i = low - 1; // Index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot
            if (orders[j].getTotalPrice() < pivot) {
                i++;

                // Swap orders[i] and orders[j]
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        // Swap orders[i+1] and orders[high] (pivot)
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Order[] orders = {
                new Order(101, "Alice", 150.0),
                new Order(205, "Bob", 80.0),
                new Order(307, "Charlie", 200.0),
                new Order(412, "David", 50.0),
                new Order(524, "Eve", 120.0)
        };

        // Perform Bubble Sort
        bubbleSort(orders);
        System.out.println("Sorted Orders by totalPrice using Bubble Sort:");
        printOrders(orders);

        // Perform Quick Sort
        quickSort(orders, 0, orders.length - 1);
        System.out.println("\nSorted Orders by totalPrice using Quick Sort:");
        printOrders(orders);
    }

    // Utility method to print orders
    private static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order.getOrderId() + " - " + order.getCustomerName() + " - " + order.getTotalPrice());
        }
    }
}
