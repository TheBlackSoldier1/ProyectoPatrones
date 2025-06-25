package devices;

public class BasicDeviceImpl implements DeviceImpl {
    public void on(String name) {
        System.out.println(name + " encendido.");
    }
    public void off(String name) {
        System.out.println(name + " apagado.");
    }
}
