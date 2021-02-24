package Com.Massvaccination;

import java.util.Scanner;

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
        Display.proceed();
        this.sc.nextLine();
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

        Display.save();
        this.sc.nextLine();

    }

    public void booker(){
        Display.booking();
        this.sc = new Scanner(System.in);
//        String input = this.sc.nextLine();
    }

}