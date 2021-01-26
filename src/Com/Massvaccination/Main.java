public class Main {
    public static void main(String[] args){

        // Calling methods from other classes
        Issues i = new Issues();
        Countries c = new Countries();
        Vaccine v = new Vaccine();

        // Asks user to select a country from the list.
            System.out.println("What Scandinavian country are you from?");

            /* Sleep function to add a bit of delay to the text
        so it does not print out everything at once */
        new Sleep(1000);
            System.out.println("1. Sweden");
        new Sleep(500);
            System.out.println("2. Denmark");
        new Sleep(500);
            System.out.println("3. Norway");

            /* Prints out the three available options and tells the user how big
        the population is in the selected country */
        c.userCountry();

        new Sleep(2000);
            System.out.println("Order for vaccine has begun...");
        new Sleep(2000);
            // Imports a random issue from the Issue class and prints it in the console.
        i.randomIssue();

        new Sleep(2000);
            System.out.println("Counting the available vaccine");
        new Sleep(2000);
            System.out.println("...");

        new Sleep(2000);

            /* Imports the method from the vaccine class and
            counts the vaccine available for delivery
             */
        v.vaccineNumber();


    }
}


