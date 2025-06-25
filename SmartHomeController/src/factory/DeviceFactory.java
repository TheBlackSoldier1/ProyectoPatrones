package factory;

import devices.*;

public class DeviceFactory {
    public static Device createDevice(String type, String name) {
        return switch (type.toLowerCase()) {
            case "light" -> new Light(name);
            case "thermostat" -> new Thermostat(name);
            default -> null;
        };
    }
}
