import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Timer timer = new Timer();
        System.out.print("Enter the # of seconds for countdown:");
        int response = scan.nextInt();

        TimerTask timerTask = new TimerTask() {
            int count = response;
            @Override
            public void run() {
                System.out.println(count);
                count--;
                if(count == 0){
                    System.out.println("HAPPY NEW YEAR");
                    timer.cancel();
                }
            }
        };

        timer.schedule(timerTask, 0, 1000);
        scan.close();
    }
}
