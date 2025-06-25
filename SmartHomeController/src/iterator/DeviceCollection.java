package iterator;

import devices.Device;
import java.util.*;

public class DeviceCollection implements Iterable<Device> {
    private final List<Device> devices = new ArrayList<>();
    public void addDevice(Device d) { devices.add(d); }
    public Iterator<Device> iterator() { return devices.iterator(); }
}
