package assignment1;

/**
 * Task 3 - 'Design by Contract' (Abstraction)
 *
 * The contract every smart device must honour. It says WHAT a smart
 * device can do, not HOW it does it.
 */
public interface SmartDevice {
    void turnOn();
    void turnOff();
    String getStatus();
}
