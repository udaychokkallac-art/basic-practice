import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(new MyRunnable("Ping"));
        Thread thread2 = new Thread(new MyRunnable("Pong"));
//        thread.setDaemon(true);
        System.out.println("GAME START");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread got interrupted");
        }
        System.out.println("GAME OVER");
    }
}
