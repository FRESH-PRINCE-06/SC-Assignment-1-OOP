package assignment1;

/**
 * Task 2 - Developer extends Employee.
 * Pay = base salary + a fixed tech allowance.
 */
public class Developer extends Employee {

    private double techAllowance;

    public Developer(String name, double baseSalary, double techAllowance) {
        super(name, baseSalary);
        this.techAllowance = techAllowance;
    }

    @Override
    public double calculatePay() {
        return baseSalary + techAllowance;
    }
}
