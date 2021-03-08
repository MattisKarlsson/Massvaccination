package Com.Massvaccination;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

// Try - Catch since code might throw IOException error.
public class Database {

    // Clears database on start of program
    // writer.close clears the file
    public static void clearDatabase() {
        try{
            FileWriter writer = new FileWriter("CovidResults.txt");
            writer.close();
        } catch (IOException e) {                   // Catches IOException error
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    // Using Scanner to read from file.
    public static void readFile (){
            try {
                File myObj = new File("CovidResults.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            } catch (
        FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
    }

    public boolean createDatabase(String filename) {
        try{
            File myObj = new File(filename);        // Import File method
            return  myObj.createNewFile();          // Creates file from filename input
        } catch (IOException e) {                   // Catches IOException error
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return false;
    }

    public void updateDatabase(String filename, String country, int months) {

        try {
            FileWriter writer = new FileWriter(filename, true);  // append = true: to not overwrite on each country selection.
            writer.write(country+": ");
            writer.write(String.valueOf(months));                       // Converts int to string, to write properly to text file
            writer.write(" months\n");
            writer.close();
        } catch (IOException e) {                  // Catches IOException error
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
