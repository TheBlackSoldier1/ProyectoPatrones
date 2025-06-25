package devices;

public class Thermostat extends Device {
    public Thermostat(String name) {
        super(name, new BasicDeviceImpl());
    }
    public void turnOn() { impl.on(name); }
    public void turnOff() { impl.off(name); }
}
