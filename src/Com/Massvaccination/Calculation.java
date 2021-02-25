package Com.Massvaccination;

// Constructor taking arguments from classes Country and Vaccine
// Then using a for loop to calculate months until population vaccinated.
class Calculation {
    public Calculation(int population, int afterLosses, String name) {
        int vaccinated = 0;
        byte months = 0;
        for (int i = 0; vaccinated <= population; i++) {
            vaccinated = vaccinated + afterLosses;
            months ++;
        }
        Display.calculation(name, months);        // To call on calculation results to Display.
        Database db = new Database();
        db.updateDatabase("CovidResults.txt", name, months);
    }
}