package Com.Massvaccination;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Main {
    public static void main(String[] args){
        Controller controller = new Controller(); // To import class Controller
        String input;                             // Declare empty string

        boolean run = true;                       // Declare boolean run to = true
        while(run) {                              // While-loop to run, as long as run = true
            input = controller.start();           // Set input to call on class/method, which then calls on scanner


            // Switch-method to listen to input
            // if other than 1 || 2, set run == false breaking the method.
            switch (input) {
                case "1":
                    controller.country();
                    break;
                case "2":
                    controller.booker();
                    break;
                default:
                    run = false;
                    Display.exit();
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
