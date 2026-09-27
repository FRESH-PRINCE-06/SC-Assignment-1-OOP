package assignment1;

/**
 * Task 1 - The 'Broken Vault' (Encapsulation)
 *
 * A properly encapsulated digital wallet. All fields are private, so no
 * outside class can reach in and set balance or pinCode directly. Business
 * rules (balance never negative, pin set once, pin required to withdraw)
 * are enforced inside the class itself, not left to the goodwill of the
 * calling code.
 */
public class DigitalWallet {

    private String accountHolder;
    private double balance;
    private final String pinCode; // set once in the constructor, never exposed

    public DigitalWallet(String accountHolder, double initialBalance, String pinCode) {
        this.accountHolder = accountHolder;
        // Business rule: balance can never be negative, even at creation.
        this.balance = (initialBalance < 0) ? 0 : initialBalance;
        this.pinCode = pinCode;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Note: there is deliberately no getPinCode() or setPinCode().
    // The pin can only ever be checked internally, never read or changed.

    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit failed: amount must be positive.");
            return false;
        }
        balance += amount;
        System.out.println("Deposited Rs. " + amount + " -> New balance: Rs. " + balance);
        return true;
    }

    /**
     * Only processes the withdrawal if the entered pin matches AND
     * sufficient funds exist. Balance can never go negative as a result
     * of this method.
     */
    public boolean withdraw(double amount, String enteredPin) {
        if (!pinCode.equals(enteredPin)) {
            System.out.println("Withdrawal of Rs. " + amount + " failed: incorrect PIN.");
            return false;
        }
        if (amount <= 0) {
            System.out.println("Withdrawal failed: amount must be positive.");
            return false;
        }
        if (amount > balance) {
            System.out.println("Withdrawal of Rs. " + amount + " failed: insufficient funds (balance Rs. " + balance + ").");
            return false;
        }
        balance -= amount;
        System.out.println("Withdrawal of Rs. " + amount + " successful -> New balance: Rs. " + balance);
        return true;
    }

    public static void main(String[] args) {
        DigitalWallet wallet = new DigitalWallet("Ali Raza", 5000.0, "4521");

        System.out.println("Account Holder: " + wallet.getAccountHolder());
        System.out.println("Initial Balance: Rs. " + wallet.getBalance());
        System.out.println();

        wallet.withdraw(1500, "9999");   // wrong pin -> should fail
        wallet.withdraw(1500, "4521");   // correct pin, sufficient funds -> should succeed
        wallet.withdraw(10000, "4521");  // correct pin, insufficient funds -> should fail
        wallet.deposit(2000);

        System.out.println();
        System.out.println("Final Balance: Rs. " + wallet.getBalance());

        // The line below is intentionally commented out.
        // Uncommenting it causes a COMPILE ERROR because balance and
        // pinCode are private and DigitalWallet.java is the only place
        // allowed to touch them directly:
        // wallet.balance = -999999;
        // wallet.pinCode = "0000";
    }
}
