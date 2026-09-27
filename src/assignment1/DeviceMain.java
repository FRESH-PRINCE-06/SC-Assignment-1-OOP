package assignment1;

import java.util.ArrayList;
import java.util.List;

/**
 * Task 3 - Demonstrates programming to the SmartDevice abstraction.
 * A List<SmartDevice> can hold both SmartBulb and SmartThermostat objects,
 * and turnOn()/turnOff()/getStatus() work identically through the
 * interface reference, even though each device is very different inside.
 */
public class DeviceMain {

    public static void main(String[] args) {
        SmartBulb bulb = new SmartBulb();
        bulb.turnOn();
        bulb.setBrightness(70);

        SmartThermostat thermostat = new SmartThermostat();
        thermostat.turnOn();
        thermostat.setTemperature(22.5);

        List<SmartDevice> devices = new ArrayList<>();
        devices.add(bulb);
        devices.add(thermostat);

        System.out.println();
        System.out.println("Status of all devices (via SmartDevice reference):");
        for (SmartDevice d : devices) {
            System.out.println(" - " + d.getClass().getSimpleName() + " -> " + d.getStatus());
        }
    }
}
