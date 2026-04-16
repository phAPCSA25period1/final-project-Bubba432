public class Button {
    private int x;
    private int y;
    private final int LIMIT_X = 800; // Simulated screen width
    private final int LIMIT_Y = 600; // Simulated screen height

    // Constructor: Starts the button at the center
    public Button() {
        this.x = LIMIT_X / 2;
        this.y = LIMIT_Y / 2;
    }

    // Teleports button to a random location
    public void jump() {
        this.x = (int) (Math.random() * LIMIT_X);
        this.y = (int) (Math.random() * LIMIT_Y);
    }

    
    public int getX() { return x; }
    public int getY() { return y; }

    // Logic to check if mouse is too close
    public boolean isClose(int mouseX, int mouseY) {
        double distance = Math.sqrt(Math.pow(x - mouseX, 2) + Math.pow(y - mouseY, 2));
        return distance < 100; // 100 pixels is the "danger zone"
    }
}
