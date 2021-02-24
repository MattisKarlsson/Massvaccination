package Com.Massvaccination;

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