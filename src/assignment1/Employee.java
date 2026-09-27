package assignment1;

/**
 * Task 2 - The 'Evolving Workforce' (Inheritance & Polymorphism)
 *
 * Base class for every kind of employee. calculatePay() is deliberately
 * written to be overridden - it gives the "generic" pay (just the base
 * salary) so that any subclass which forgets to override it still behaves
 * sensibly.
 */
public class Employee {

    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculatePay() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + getClass().getSimpleName() + ") -> Rs. " + calculatePay();
    }
}
