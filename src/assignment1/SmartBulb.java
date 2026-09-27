package assignment1;

/**
 * Task 3 - SmartBulb implements SmartDevice and adds its own
 * unique method, setBrightness(int level), which is not part of the
 * shared contract.
 */
public class SmartBulb implements SmartDevice {

    private boolean on;
    private int brightness;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Bulb turned ON.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Bulb turned OFF.");
    }

    @Override
    public String getStatus() {
        return on ? "ON (brightness " + brightness + "%)" : "OFF";
    }

    public void setBrightness(int level) {
        if (level < 0) level = 0;
        if (level > 100) level = 100;
        this.brightness = level;
        System.out.println("Bulb brightness set to " + brightness + "%.");
    }
}
