import java.util.ArrayList;
import java.util.Scanner;

public class App {
    // ... existing Phase 1 & 2 logic here ...

    public static void startSprint3(Scanner scanner) {
        ArrayList<Obstacle> activeErrors = new ArrayList<>();
        activeErrors.add(new Obstacle("Initial Validation Error", 101));

        boolean sprint3Complete = false;

        while (!sprint3Complete) {
            System.out.println("\n--- CURRENT ACTIVE ERRORS ---");
            for (Obstacle o : activeErrors) {
                System.out.println(o);
            }

            System.out.print("\nEnter Error ID to close (or '99' to attempt 'Turn In'): ");
            int choice = scanner.nextInt();

            if (choice == 99) {
                // DAY 2 LOGIC: The Multiplier
                System.out.println("⚠️ Warning: Bypassing errors caused them to multiply!");
                for (int i = 0; i < 3; i++) {
                    int newId = (int)(Math.random() * 899) + 100;
                    activeErrors.add(new Obstacle("Secondary System Failure", newId));
                }
            } else {
                // DAY 3 LOGIC: The Removal (Backward Iteration)
                // We loop backward to avoid ConcurrentModificationException or skipping indexes
                boolean removed = false;
                for (int i = activeErrors.size() - 1; i >= 0; i--) {
                    if (activeErrors.get(i).getId() == choice) {
                        activeErrors.remove(i);
                        removed = true;
                        System.out.println(">> Error " + choice + " resolved.");
                    }
                }
                if (!removed) System.out.println("!! ID not found. Pop-up persists !!");
            }

            // Check if all obstacles are cleared
            if (activeErrors.isEmpty()) {
                sprint3Complete = true;
            }
        }
        System.out.println("\n[FINAL STATUS]: All obstacles cleared. Submission link unlocked.");
    }
}
