package assignment1;

import java.util.ArrayList;
import java.util.List;

/**
 * Task 2 - The Polymorphism Test.
 *
 * A single List<Employee> holds both Developers and SalesManagers.
 * Looping through it and calling calculatePay() on the Employee reference
 * still produces the correct, type-specific result for every object -
 * this is runtime (dynamic) polymorphism in action.
 */
public class EmployeeMain {

    public static void main(String[] args) {
        List<Employee> staff = new ArrayList<>();
        staff.add(new Developer("Hamza Tariq", 80000, 15000));
        staff.add(new SalesManager("Sara Khan", 60000, 200000, 0.05));
        staff.add(new Developer("Bilal Ahmed", 75000, 12000));
        staff.add(new SalesManager("Usman Malik", 55000, 150000, 0.08));

        System.out.println("Final pay for each employee (via Employee reference):");
        for (Employee e : staff) {
            System.out.println(" - " + e.getName() + " [" + e.getClass().getSimpleName()
                    + "] -> Rs. " + e.calculatePay());
        }
    }
}
