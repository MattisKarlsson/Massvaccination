package Com.Massvaccination;

class Display {

    public void start() {
        System.out.println("--- Master Vaccinator ---");
        System.out.println("-------  Welcome  -------");
        System.out.println("-------------------------\n");
        System.out.println("  Choose an alternative:");
        System.out.println("1. View countries for calculation");
        System.out.println("2. View calender for booking\n");
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

    public static void vaccine() {

    }

    public static void booking() {
        System.out.println("Vaccination times available:");
        Booking booking = new Booking();
//        Booking.calender();

    }
}