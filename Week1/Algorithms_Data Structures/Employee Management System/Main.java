public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem empSystem = new EmployeeManagementSystem(10); // Maximum 10 employees

        // Adding employees
        empSystem.addEmployee(new Employee(1, "John Doe", "Manager", 50000));
        empSystem.addEmployee(new Employee(2, "Jane Smith", "Developer", 60000));

        // Searching for an employee
        Employee emp = empSystem.searchEmployee(1);
        if (emp != null) {
            System.out.println("Employee found: " + emp.getName());
        } else {
            System.out.println("Employee not found.");
        }

        // Deleting an employee
        empSystem.deleteEmployee(2);

        // Traversing all employees
        empSystem.traverseEmployees();
    }
}
