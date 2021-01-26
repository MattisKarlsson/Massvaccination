import java.util.Random;
public class Issues {

    public static void randomIssue() {
        String[] issue = {"Thieves stealing some of the vaccine...", "Clumpsy driver...", "Production problems..."};
        Random r = new Random();
        int randomIssue = r.nextInt(issue.length);
        System.out.println(issue[randomIssue]);
    }
}

