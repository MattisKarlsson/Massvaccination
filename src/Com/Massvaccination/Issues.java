package Com.Massvaccination;

import java.util.Random;

class Issues {
        String[] issues = {"'Nurses stole em!'", "'Delivery train off the rails!'", "'Explosion at the lab!'", "'Gahd darn wabbits took'em!'"};
        Random random = new Random();                    // Import Class Random
        int randomIssue = random.nextInt(issues.length); // Random picks a String from it's array index.
        String displayIssue;                             // Declare variable to be set and called from Constructor.

    public Issues() {
        displayIssue = issues[randomIssue];
    }
}