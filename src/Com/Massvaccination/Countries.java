import java.util.Scanner;

public class Countries {

    public static void userCountry() {
    int sweden = 10_300_000;
    int denmark = 5_806_000;
    int norway = 5_385_000;

    while(true){
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        // Prints out the population of Sweden / Denmark / Norway
        if (userInput.equals("Sweden")) {
            System.out.println("Your population is " + sweden + ".");
            new Sleep(500);
            break;
        } else if (userInput.equals("Denmark")) {
            System.out.println("Your population is " + denmark + ".");
            new Sleep(500);
            break;
        } else if (userInput.equals("Norway")) {
            System.out.println("Your population is " + norway + ".");
            new Sleep(500);
            break;
            // If the user input is not in the list of countries.
        } else {
            System.out.println("Please select a country from the list");
            new Sleep(1000);
            System.out.println( "1. Sweden\n" + "2. Denmark\n" + "3. Norway");
            continue;
        }

        }
    }
}

