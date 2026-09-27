package assignment1;

/**
 * Task 2 - SalesManager extends Employee.
 * Pay = base salary + commission earned on total sales.
 */
public class SalesManager extends Employee {

    private double totalSales;
    private double commissionRate; // e.g. 0.05 = 5%

    public SalesManager(String name, double baseSalary, double totalSales, double commissionRate) {
        super(name, baseSalary);
        this.totalSales = totalSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculatePay() {
        return baseSalary + (totalSales * commissionRate);
    }
}
