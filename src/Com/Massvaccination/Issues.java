package Com.Massvaccination;

import java.util.Random;

class Issues {
    public static void issues() {
        String[] issue = {"Production issue", "Delivery issue", "Thieving nurses!"};
        String[] madIssues = {"Nurses always be stealing!", "Train off the rails!", "Mad scientist on the loose!", "Gahd darn wabbits tookem!"};
        Random random = new Random();
        int randomIssue = random.nextInt(issue.length);
        int randomMadIssue = random.nextInt(madIssues.length);
        System.out.println(madIssues[randomMadIssue]);
    }
}