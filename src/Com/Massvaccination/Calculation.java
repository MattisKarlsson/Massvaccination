package Com.Massvaccination;

// Constructor taking arguments from classes Country and Vaccine
// Then using a for loop to calculate months until population vaccinated.
class Calculation {
    public Calculation(int population, int afterLosses, String name) {
        int vaccinated = 0, months = 0;
        for (int i = 0; vaccinated <= population; i++) {
            vaccinated = vaccinated + afterLosses;
            months ++;
        }
        Display.calculation(name, months);
    }
}