package observer;

import java.util.*;

public class DeviceSubject implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer o) { observers.add(o); }
    public void removeObserver(Observer o) { observers.remove(o); }
    public void notifyObservers(String message) {
        for (Observer o : observers) o.update(message);
    }
}
