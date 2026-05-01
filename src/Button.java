public class Button {
    private int x;
    private int y;
    private final int LIMIT_X = 800;
    private final int LIMIT_Y = 600;

    public Button() {
        this.x = LIMIT_X / 2;
        this.y = LIMIT_Y / 2;
    }

    public void jump() {
        this.x = (int) (Math.random() * LIMIT_X);
        this.y = (int) (Math.random() * LIMIT_Y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isClose(int mouseX, int mouseY) {
        double distance = Math.sqrt(Math.pow(x - mouseX, 2) + Math.pow(y - mouseY, 2));
        return distance < 100;
    }
}
