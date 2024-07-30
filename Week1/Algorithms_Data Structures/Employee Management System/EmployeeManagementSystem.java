public class EmployeeManagementSystem {
    private Employee[] employees; // Array to store employees
    private int maxSize; // Maximum number of employees the system can hold
    private int currentSize; // Current number of employees in the system

    // Constructor
    public EmployeeManagementSystem(int maxSize) {
        this.maxSize = maxSize;
        this.employees = new Employee[maxSize];
        this.currentSize = 0;
    }

    // Method to add an employee
    public void addEmployee(Employee emp) {
        if (currentSize < maxSize) {
            employees[currentSize] = emp;
            currentSize++;
            System.out.println("Employee added successfully.");
        } else {
            System.out.println("Employee database is full. Cannot add more employees.");
        }
    }

    // Method to search for an employee by employeeId
    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < currentSize; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null; // Employee not found
    }

    // Method to traverse and print all employees
    public void traverseEmployees() {
        for (int i = 0; i < currentSize; i++) {
            System.out.println(employees[i]);
        }
    }

    // Method to delete an employee by employeeId
    public void deleteEmployee(int employeeId) {
        int index = -1;
        for (int i = 0; i < currentSize; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < currentSize - 1; i++) {
                employees[i] = employees[i + 1];
            }
            employees[currentSize - 1] = null; // Remove reference
            currentSize--;
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }
}
