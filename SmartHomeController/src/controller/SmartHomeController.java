package controller;

public class SmartHomeController {
    private static SmartHomeController instance;
    private SmartHomeController() {}
    public static SmartHomeController getInstance() {
        if (instance == null) {
            instance = new SmartHomeController();
        }
        return instance;
    }
    public void log(String msg) {
        System.out.println("[LOG]: " + msg);
    }
}
