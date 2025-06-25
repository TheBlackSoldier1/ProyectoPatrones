package devices;

public class Light extends Device {
    public Light(String name) {
        super(name, new BasicDeviceImpl());
    }
    public void turnOn() { impl.on(name); }
    public void turnOff() { impl.off(name); }
}
