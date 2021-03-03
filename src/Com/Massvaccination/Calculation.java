package Com.Massvaccination;

// Step 4.
class Calculation {
// Constructor taking arguments from classes Country and Vaccine
    public Calculation(int population, int afterLosses, String name) {
// Then using a for loop to calculate months until population vaccinated.
        int vaccinated = 0, months = 0;                    // Declare empty Int variables
        for (int i = 0; vaccinated <= population; i++) {   // Run while Vaccinated = less than population
            afterLosses = afterLosses + 20000;             // Add another 20000 to Vaccine doses to make it more realistic
            vaccinated = vaccinated + afterLosses;         // Add available doses to vaccinated every loop.
            months ++;                                     // Add 1 to months to display number of months(loops) to finish.

        }
        Display.calculation(name, months);        // To call on calculation results to Display.
        Database db = new Database();             // Import Database class
        db.updateDatabase("CovidResults.txt", name, months);  // Save name and months in Txt file CovidResults.
    }
}