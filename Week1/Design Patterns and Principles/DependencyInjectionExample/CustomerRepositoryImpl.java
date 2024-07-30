// CustomerRepositoryImpl.java
public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public Customer findCustomerById(int customerId) {
        // Simulate fetching customer from a database or data source
        return new Customer(customerId, "John Doe", "john.doe@example.com");
    }
}
