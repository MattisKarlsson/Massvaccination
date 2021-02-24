package Com.Massvaccination;
import java.util.Random;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;


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
        } else if (countryInput.equals("2")){
            Denmark denmark = new Denmark();
            denmark.printInfo();
        } else if (countryInput.equals("3")){
            Norway norway = new Norway();
            norway.printInfo();
        } else if (countryInput.equals("4")) {
            Finland finland = new Finland();
            finland.printInfo();
        }
        calculator(countryInput);

    }

    public void calculator(String input){
            Vaccine vaccine = new Vaccine();
            Sweden sweden = new Sweden();
            Denmark denmark = new Denmark();
            Norway norway = new Norway();
            Finland finland = new Finland();

        if(input.equals("1")){
            new Calculation(sweden.population, vaccine.afterLosses, sweden.name);
        } else if (input.equals("2")){
            new Calculation(denmark.population, vaccine.afterLosses, denmark.name);
        } else if (input.equals("3")){
            new Calculation(norway.population, vaccine.afterLosses, norway.name);
        } else if (input.equals("4")) {
            new Calculation(finland.population, vaccine.afterLosses, finland.name);
        }

//        this.sc.nextLine();
    }

    public void booker(){
        Display.booking();
        this.sc = new Scanner(System.in);
//        String input = this.sc.nextLine();
    }

}


class Display {

    public void start() {
        System.out.println("--- Master Vaccinator ---");
        System.out.println("-------  Welcome  -------");
        System.out.println("-------------------------\n");
        System.out.println("  Choose an alternative");
        System.out.println("1. View countries for calculation");
        System.out.println("2. View calender for booking\n");
    }

    public static void countries() {
        System.out.println("Choose a country to start calculation.");
        System.out.println("1. Sweden");
        System.out.println("2. Denmark");
        System.out.println("3. Norway");
        System.out.println("4. Finland\n");
    }


    public static void booking() {
        System.out.println("Vaccination times available");
        Booking booking = new Booking();
//        Booking.calender();

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

class Booking {
//    Date today = Calender.getInstance().getTime();
//
//    public static void calender() {
//
//        int month = 2;
//
//        Calendar cal = new GregorianCalendar();
//        int cDay = cal.get(Calendar.DATE);
//        int cMonth = cal.get(Calendar.MONTH);
//
//        GregorianCalendar gCal = new GregorianCalendar(month);
//        int days = gCal.getActualMaximum(Calendar.DATE);
//    }


}












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

class Calculation {
    public Calculation(int population, int afterLosses, String name) {
        int vaccinated = 0, months = 0;
        for (int i = 0; vaccinated <= population; i++) {
            vaccinated = vaccinated + afterLosses;
            months ++;
        }
            System.out.println("The vaccine distribution for "+name+" has been calculated to "+months+" months\n");
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

