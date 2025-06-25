package observer;

public class CentralPanel implements Observer {
    private final String id;
    public CentralPanel(String id) { this.id = id; }
    public void update(String message) {
        System.out.println("[Panel " + id + "]: " + message);
    }
}
