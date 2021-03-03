package Com.Massvaccination;
import java.util.Scanner;                      // Import Scanner

class Controller {

    // Declare private Display & Scanner class for Controller Constructor
    private Display display;
    private Scanner sc;

    // Constructor for Controller class to call on.
    public Controller() {
        display = new Display();
        sc = new Scanner(System.in);
    }
    // Calling method start in class Display then take input from scanner.
    public String start(){
        display.start();
        return sc.nextLine();
    }

    // Step 2.
    // 1a. Method country displaying countries,
    public void country(){
        Display.countries();

    // 1b. Scanner input to call on switch = countryInput,
        String countryInput = sc.nextLine();

    // 2.  Calling country method on input (countryInput).
        switch (countryInput) {
            case "1" -> {
                Sweden sweden = new Sweden();
                sweden.printInfo();
            }
            case "2" -> {
                Denmark denmark = new Denmark();
                denmark.printInfo();
            }
            case "3" -> {
                Norway norway = new Norway();
                norway.printInfo();
            }
            case "4" -> {
                Finland finland = new Finland();
                finland.printInfo();
            }
        }

    // 3a. Call Display.proceed for text.
        Display.proceed();
    // 3b. Listen to input
        this.sc.nextLine();
    // 3c. Calling calculator with switch input as argument
        calculator(countryInput);

    }

    // Step 3.
    public void calculator(String countryInput){
        // Declare classes to access variables
        Vaccine vaccine = new Vaccine();
        Sweden sweden = new Sweden();
        Denmark denmark = new Denmark();
        Norway norway = new Norway();
        Finland finland = new Finland();

        // Call on class Calculation with countryInput as arguments
        switch (countryInput) {
            case "1" -> new Calculation(sweden.population, vaccine.afterLosses, sweden.name);
            case "2" -> new Calculation(denmark.population, vaccine.afterLosses, denmark.name);
            case "3" -> new Calculation(norway.population, vaccine.afterLosses, norway.name);
            case "4" -> new Calculation(finland.population, vaccine.afterLosses, finland.name);
        }

        Display.save();
        // input just to make program more interactive
        this.sc.nextLine();

    }

    public void booker(){
        Display.booking();
        this.sc = new Scanner(System.in);
//        String input = this.sc.nextLine();
    }

}