public class Scrambler {
    private char[] letters;
    private final int SIZE = 50;
    private String targetPhrase = "IPROMISETHISISNOTLATE";
    private int currentIndex = 0;

    public Scrambler() {
        letters = new char[SIZE];
        randomize();
    }

    private void randomize() {
        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char) ('A' + (int) (Math.random() * 26));
        }
    }

    public void display() {
        System.out.println("\n" + "=".repeat(30));
        System.out.println("SECURITY VERIFICATION REQUIRED");
        System.out.println("Spell: " + targetPhrase);
        System.out.println("Progress: " + targetPhrase.substring(0, currentIndex) + "___");
        System.out.println("=".repeat(30));

        for (int i = 0; i < letters.length; i++) {
            System.out.printf("[%2d]: %c  ", i, letters[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    public boolean checkInput(int userChoice) {
        if (userChoice < 0 || userChoice >= letters.length) {
            System.out.println("!! ERROR: Index out of bounds. Access Denied. !!");
            return false;
        }

        char chosenChar = letters[userChoice];
        char neededChar = targetPhrase.charAt(currentIndex);

        if (chosenChar == neededChar) {
            System.out.println(">> MATCH FOUND. Advancing...");
            currentIndex++;
            return true;
        } else {
            System.out.println("!! MISMATCH: '" + chosenChar + "' is not '" + neededChar + "' !!");
            System.out.println("!! SECURITY RESET: Restart the sequence. !!");
            currentIndex = 0;
            return false;
        }
    }

    public boolean isComplete() {
        return currentIndex >= targetPhrase.length();
    }

    public String getTargetPhrase() {
        return targetPhrase;
    }
}
