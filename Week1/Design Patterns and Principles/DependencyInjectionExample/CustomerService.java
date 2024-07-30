// CustomerService.java
public class CustomerService {

    private CustomerRepository customerRepository;

    // Constructor injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer findCustomerById(int customerId) {
        return customerRepository.findCustomerById(customerId);
    }
}
