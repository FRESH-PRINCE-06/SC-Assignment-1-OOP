package assignment1;

/**
 * Task 3 - SmartThermostat implements SmartDevice and adds its own
 * unique method, setTemperature(double temp), which is not part of the
 * shared contract.
 */
public class SmartThermostat implements SmartDevice {

    private boolean on;
    private double temperature;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Thermostat turned ON.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Thermostat turned OFF.");
    }

    @Override
    public String getStatus() {
        return on ? "ON (set to " + temperature + " C)" : "OFF";
    }

    public void setTemperature(double temp) {
        this.temperature = temp;
        System.out.println("Thermostat temperature set to " + temp + " C.");
    }
}
