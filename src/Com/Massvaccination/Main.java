package Com.Massvaccination;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Controller controller = new Controller();
        String input;

        boolean run = true;
        while(run) {
            input = controller.start();

            switch (input) {
                case "1":
                    controller.country();
                    break;
                case "2":
                    controller.booker();
                    break;
                default:
                    run = false;
                    System.out.println("Exiting Master Vaccinator");
                    break;
            }
        }
    }
}

class Controller {

    // So all methods can reach scanner.
    private Display display;
    private Scanner sc;

    public Controller() {
        this.display = new Display();
        this.sc = new Scanner(System.in);
    }

    public String start(){
        this.display.start();
        return this.sc.nextLine();
    }

    public void country(){
        Display.countries();
        String countryInput = sc.nextLine();

        if(countryInput.equals("1")){
            Sweden sweden = new Sweden();
            sweden.printInfo();
            Denmark denmark = new Denmark();
            denmark.printInfo();
        } else if (countryInput.equals("3")){
            Norway norway = new Norway();
            norway.printInfo();
        } else if (countryInput.equals("4")) {
            Finland finland = new Finland();
            finland.printInfo();
        }
        System.out.println("Press any key to continue");
        calculator(countryInput);
    }

    public void calculator(String input){
            Vaccine vaccine = new Vaccine();
            Sweden sweden = new Sweden();
            Denmark denmark = new Denmark();
            Norway norway = new Norway();
            Finland finland = new Finland();

        if(input.equals("1")){
            new Calculation(sweden.population, vaccine.afterLosses);
        } else if (input.equals("2")){
            new Calculation(denmark.population, vaccine.afterLosses);
        } else if (input.equals("3")){
            new Calculation(norway.population, vaccine.afterLosses);
        } else if (input.equals("4")) {
            new Calculation(finland.population, vaccine.afterLosses);
        }

//        this.sc.nextLine();
    }

    public void booker(){
        Display.booking();
//        String input = this.sc.nextLine();
    }

}


class Display {

    public void start(){
        System.out.println("--- Master Vaccinator ---");
        System.out.println("-------------------------");
        System.out.println(" Choose alternative");
        System.out.println("1. View countries for calculation");
        System.out.println("2. View calender for booking\n");
    }

    public static void countries(){
        System.out.println("Choose a country to start calculation.");
        System.out.println("1. Sweden");
        System.out.println("2. Denmark");
        System.out.println("3. Norway");
        System.out.println("4. Finland\n");
    }


    public static void calculating(){
        System.out.println("---Calculator---");
        System.out.println("---Press 1 to start calculation---");

    }

    public static void booking(){
        System.out.println("Vaccination times available");
        System.out.println("1st.2nd.3rd.5th.6th.7th....");
    }

}


class Country {
        public int population;
        public String name;
    public void printInfo(){
        System.out.println("You've chosen " + this.name + ".\n" + this.name + "'s current population is "+ this.population + ".\n");
}}
class Sweden extends Country{
    public Sweden(){
        super.population = 10_300_000;
        super.name = "Sweden";
    }
}
class Denmark extends Country {
    public Denmark() {
        super.population = 5_806_000;
        super.name = "Denmark";
    }
}
class Norway extends Country{
    public Norway() {
    super.population = 5_385_000;
    super.name = "Norway";
    }
}
class Finland extends Country {
    public Finland() {
    super.population = 5_545_000;
    super.name = "Finland";
    }
}

class Vaccine {
    public int afterLosses;
    public Vaccine() {
        Random r = new Random();
        int randomAmount = r.nextInt(120000-60000)+60000;
        int lostAmount = (int) (Math.random() * 10000);
        this.afterLosses = randomAmount - lostAmount;
        System.out.println("The selected country has ordered "+randomAmount+ " doses.");
        System.out.println("Vaccine doses not delivered "+lostAmount);
        System.out.println("Vaccine doses delivered "+afterLosses + "\n");
    }
}

class Calculation {
    public Calculation(int population, int afterLosses) {
        int vaccinated = 0, months = 0;
        for (int i = 0; vaccinated <= population; i++) {
            vaccinated = vaccinated + afterLosses;
            months ++;
        }
            System.out.println(vaccinated);
            System.out.println(months);
    }
}

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

