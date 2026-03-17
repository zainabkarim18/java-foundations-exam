/**
 * Main — demonstrate your Employee Management System.
 *
 * YOUR TASKS:
 *   Part C — Create Manager and Intern objects, demonstrate polymorphism
 *   Part D — Add try/catch blocks for exception handling
 *
 * This file should compile and run, printing output that proves
 * all your code works correctly.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=== PART A: Salary Utilities ===");
        // TODO: Test all 4 SalaryUtils methods and print results
        // Example:
           System.out.println("Annual salary: " + SalaryUtils.calculateAnnualSalary(3000));
           System.out.println("Tax on 25000: " + SalaryUtils.calculateTax(25000));
           System.out.println("Net salary: " + SalaryUtils.calculateNetSalary(25000));
           System.out.println("After 10% raise: " + SalaryUtils.applyRaise(3000, 10));


        System.out.println("\n=== PART B: Employee Manager ===");
        // TODO: Create an EmployeeManager
        EmployeeManager manager = new EmployeeManager();
        // TODO: Create and add at least 3 employees to it
        Employee employee1 = new Employee(1, "Zainab", "Engineering", 3500);
        Employee employee2 = new Employee(2, "Sara", "HR", 6800);
        Employee employee3 = new Employee(3, "Noor", "Engineering", 4000);

        manager.addEmployee(employee1);
        manager.addEmployee(employee2);
        manager.addEmployee(employee3);

        // TODO: Demonstrate findById (found + not found)
        //found
        System.out.println("Find Employee with ID 3: " + manager.findById(3).getName());
        // not found
        System.out.println("Find Employee with ID 5: " + manager.findById(5));

        // TODO: Demonstrate getEmployeesByDepartment
        System.out.println("Employees in Engineering:");
        for (Employee emp : manager.getEmployeesByDepartment("engineering")) {
            System.out.println(emp.getName());
        }


        System.out.println("\n=== PART C: Inheritance & Polymorphism ===");
        // TODO: Create at least 1 Manager and 1 Intern
        // TODO: Add all employees (Employee, Manager, Intern) to the manager
        // TODO: Loop through getAllEmployees() and call getBonus() on each
        //       Print: "<name> bonus: <amount>" for each one
        //       This demonstrates polymorphism — same method call, different behavior


        System.out.println("\n=== PART D: Exception Handling ===");
        // TODO: Use try/catch to demonstrate:
        //   1. Trying to remove an employee that doesn't exist
        //   2. Trying to promote an employee that's already a Manager
        //   3. Trying to create an Employee with invalid data (negative salary)
        // Each try/catch should print the error message gracefully

    }
}
