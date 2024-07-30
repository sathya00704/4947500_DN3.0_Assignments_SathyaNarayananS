// DependencyInjectionTest.java
public class DependencyInjectionTest {

    public static void main(String[] args) {
        // Create a CustomerRepository instance
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Create a CustomerService instance with injected CustomerRepository
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the service to find a customer by ID
        Customer customer = customerService.findCustomerById(1);

        // Display customer details
        System.out.println("Customer found:");
        System.out.println("ID: " + customer.getId());
        System.out.println("Name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
    }
}
