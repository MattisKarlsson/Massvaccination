package Com.Massvaccination;

import java.util.Random;

class Vaccine {
    public int afterLosses;
    public Vaccine() {
        Random r = new Random();
        int randomAmount = r.nextInt(120000-60000)+60000;
        int lostAmount = (int) (Math.random() * 10000);
        this.afterLosses = randomAmount - lostAmount;
        System.out.println("----Vaccine information----");
        System.out.println("The selected country has ordered "+randomAmount+ " doses.");
        System.out.println("Vaccine doses not delivered "+lostAmount);
        System.out.println("Vaccine doses delivered "+afterLosses + "\n");
    }
}