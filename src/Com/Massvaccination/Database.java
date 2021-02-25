package Com.Massvaccination;
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors

public class Database {

    public boolean createDatabase(String filename) {
        try{
            File myObj = new File(filename);
            return  myObj.createNewFile();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateDatabase(String filename, String country, byte months) {

        try {
            FileWriter myWriter = new FileWriter(filename);
            myWriter.write(country);
            myWriter.write(months);
            myWriter.close();
            return true;
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return false;
    }
}
