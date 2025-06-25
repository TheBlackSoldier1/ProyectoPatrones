import controller.SmartHomeController;
import factory.DeviceFactory;
import devices.Device;
import observer.*;
import iterator.DeviceCollection;

public class Main {
    public static void main(String[] args) {
        SmartHomeController controller = SmartHomeController.getInstance();
        controller.log("Iniciando sistema...");

        Device light = DeviceFactory.createDevice("light", "Luz sala");
        Device thermo = DeviceFactory.createDevice("thermostat", "Termostato cocina");

        CentralPanel panel = new CentralPanel("A1");
        DeviceSubject subject = new DeviceSubject();
        subject.addObserver(panel);

        light.turnOn();
        subject.notifyObservers(light.getName() + " fue encendida");

        thermo.turnOn();
        subject.notifyObservers(thermo.getName() + " fue encendido");

        DeviceCollection collection = new DeviceCollection();
        collection.addDevice(light);
        collection.addDevice(thermo);

        controller.log("Mostrando todos los dispositivos:");
        for (Device d : collection) {
            controller.log("- " + d.getName());
        }
    }
}
