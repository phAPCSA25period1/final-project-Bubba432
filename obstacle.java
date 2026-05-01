public class Obstacle {
    private String errorMessage;
    private int id;

    public Obstacle(String message, int id) {
        this.errorMessage = message;
        this.id = id;
    }

    public String getMessage() { return errorMessage; }
    public int getId() { return id; }

    @Override
    public String toString() {
        return "⚠️ [Error ID: " + id + "] -> " + errorMessage;
    }
}
