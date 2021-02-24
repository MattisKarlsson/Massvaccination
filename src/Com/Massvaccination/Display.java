package Com.Massvaccination;


// Gathered all System.out methods in Display class to be called on.
class Display {

    public void start() {
        System.out.println("--- Master Vaccinator ---");
        System.out.println("-------  Welcome  -------");
        System.out.println("-------------------------\n");
        System.out.println("  Choose an alternative:");
        System.out.println("1. View countries for calculation");
        System.out.println("2. View calender for booking\n");
    }

    public static void exit() {
        System.out.println("Exiting Master Vaccinator");
    }

    public static void countries() {
        System.out.println("Choose a country to start calculation:");
        System.out.println("1. Sweden");
        System.out.println("2. Denmark");
        System.out.println("3. Norway");
        System.out.println("4. Finland\n");
    }

    public static void proceed() {
        System.out.println("Press any key to continue:");
    }

    public static void save() {
        System.out.println("Press any key to store calculation to database:");
    }

    public static void vaccine(int randomAmount, int lostAmount, int afterLosses) {
        System.out.println("                ----Vaccine information----");
        System.out.println("On average the selected country ordered "+randomAmount+ " doses");
        System.out.println("Average vaccine doses lost in transit per month "+lostAmount);
        System.out.println("Average vaccine doses delivered per month "+afterLosses + "\n");
    }

    public static void countryInfo(String name, int population) {
        System.out.println("You've chosen " + name + ".\n" + name + "'s current population is "+ population + ".\n");
    }

    public static void calculation(String name, int months) {
        System.out.println("                ----Calculation results----");
        System.out.println("Covid-19 vaccine distribution for "+name+" was calculated to "+months+" months\n");
    }

    public static void booking() {
        System.out.println("Vaccination times available:");
        Booking booking = new Booking();
//        Booking.calender();

    }
}