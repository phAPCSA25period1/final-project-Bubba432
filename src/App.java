import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Button submitButton = new Button();

        System.out.println("--- WELCOME TO IMPRACTICAL TURN IN BUTTON SPRINT 1 ---");

        while (true) {
            System.out.println("\nButton is currently at: (" + submitButton.getX() + ", " + submitButton.getY() + ")");
            System.out.print("Enter your mouse X coordinate (or -1 to quit): ");
            int mX = input.nextInt();
            if (mX == -1) break;

            System.out.print("Enter your mouse Y coordinate: ");
            int mY = input.nextInt();


            if (submitButton.isClose(mX, mY)) {
                System.out.println("TOO CLOSE! The button jumped!");
                submitButton.jump();
            } else if (mX == submitButton.getX() && mY == submitButton.getY()) {
                System.out.println("SUCCESS! You clicked the button (somehow).");
                break;
            } else {
                System.out.println("Missed it! Try to get exactly on the coordinates without getting too close.");
            }
        }
        input.close();
    }
}
