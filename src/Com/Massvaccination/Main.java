package Com.Massvaccination;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);      // Scanner to read input
        Controller controller = new Controller(); // To import class Controller
        String input;                             //

        boolean run = true;
        while(run) {
            input = controller.start();

            switch (input) {
                case "1":
                    controller.country();
                    break;
                case "2":
                    controller.booker();
                    break;
                default:
                    run = false;
                    System.out.println("Exiting Master Vaccinator");
                    break;
            }
        }
    }
}

class Booking {
//    Date today = Calender.getInstance().getTime();
//
//    public static void calender() {
//
//        byte month = 2;
//
//        Calendar cal = new GregorianCalendar();
//        int cDay = cal.get(Calendar.DATE);
//        int cMonth = cal.get(Calendar.MONTH);
//
//        GregorianCalendar gCal = new GregorianCalendar(month);
//        int days = gCal.getActualMaximum(Calendar.DATE);
//    }
}
