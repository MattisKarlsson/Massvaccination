package Com.Massvaccination;

import java.util.Random;

class Vaccine {
    public int afterLosses;
    public Vaccine() {
        Random r = new Random();
        int randomAmount = r.nextInt(120000-60000)+60000;
        int lostAmount = (int) (Math.random() * 10000);
        this.afterLosses = randomAmount - lostAmount;
        Display.vaccine(randomAmount, lostAmount, afterLosses);
    }
}