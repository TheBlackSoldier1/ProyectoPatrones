package devices;

public abstract class Device {
    protected DeviceImpl impl;
    protected String name;

    public Device(String name, DeviceImpl impl) {
        this.name = name;
        this.impl = impl;
    }

    public abstract void turnOn();
    public abstract void turnOff();
    public String getName() { return name; }
}
