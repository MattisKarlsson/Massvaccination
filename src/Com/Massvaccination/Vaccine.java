package Com.Massvaccination;

import java.util.Random;

class Vaccine {
    Issues issues = new Issues();                    // Import Issues
    int afterLosses;

    public Vaccine() {
        Random random = new Random();
        int randomAmount = random.nextInt(220000-60000)+60000;   // Random amount between 220000 - 60000: +60000 sets the lowest amount.
        int lostAmount = (int) (Math.random() * 10000);                // Random amount lost up to 10000
        afterLosses = randomAmount - lostAmount;                       // Final number
        Display.vaccine(randomAmount, lostAmount, afterLosses, issues.displayIssue); // Call on Method vaccine in class Display with arguments.
    }
}