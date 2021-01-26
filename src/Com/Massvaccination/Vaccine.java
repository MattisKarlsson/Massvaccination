import java.util.Random;
public class Vaccine {

    public static void vaccineNumber() {

        // Random vaccine, stolen vaccine and destroyed vaccine.
        Random rand = new Random();
        int randVaccine = (int)(Math.random() * 130000);
        int randStolenVaccine = (int)(Math.random() * 7000);
        int randDestroyedVaccine = (int)(Math.random() * 15000);
        int afterLoss = randVaccine - randStolenVaccine - randDestroyedVaccine;

        System.out.println("Total vaccine ordered: " + randVaccine);
        new Sleep(2000);
        System.out.println("Unfortunately " + randStolenVaccine + " was stolen ...");
        new Sleep(2000);
        System.out.println("And " + randDestroyedVaccine + " was destroyed during delivery...");
        new Sleep(2000);
        System.out.println("The total amount of available vaccine available: " + afterLoss + ".");

    }
}

