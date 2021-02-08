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

class Controller{

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
        String input = this.sc.nextLine();

        if(input.equals("1")){
            Sweden sweden = new Sweden();
            sweden.printInfo();
            calculator("SE");
        } else if (input.equals("2")){
            Denmark denmark = new Denmark();
            denmark.printInfo();
        } else if (input.equals("3")){
            Norway norway = new Norway();
            norway.printInfo();
        } else if (input.equals("4")) {
            Finland finland = new Finland();
            finland.printInfo();
        }
    }

    public void calculator(String country){
        Display.calculating();
        this.sc.nextLine();



    }

    public void booker(){
        Display.booking();
        String input = this.sc.nextLine();
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
        System.out.println("Countries available for calculation");
        System.out.println("1. Sweden");
        System.out.println("2. Denmark");
        System.out.println("3. Norway");
        System.out.println("4. Finland\n");
    }


    public static void calculating(){
        System.out.println("---Calculator---");
        System.out.println("---Press 1 to start calculation---");
        Vaccine.vaccines();

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
        System.out.println(this.name +"'s population is "+ this.population);
    }

}

class Sweden extends Country {
    public int population = 10_300_000;
    public String name = "Sweden";
}

class Denmark extends Country {
    public int population = 5_806_000;
    public String name = "Denmark";
}

class Norway extends Country {
    public int population = 5_385_000;
    public String name = "Norway";
}

class Finland extends Country {
    public int population = 5_545_000;
    public String name = "Finland";
}


class Vaccine {
    public static void vaccines() {
        Random random = new Random();
        int randomAmount = (int) (Math.random() * 100000);
        int lostAmount = (int) (Math.random() * 10000);
        int afterLosses = randomAmount - lostAmount;

        System.out.println("Vaccines ordered "+randomAmount);
        System.out.println("Vaccines not delivered "+lostAmount);
        System.out.println("Vaccines delivered "+afterLosses);
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