public class MyRunnable implements Runnable{
    String text;
    public MyRunnable(String text){
        this.text=text;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try{
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() +" "+ text);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
            if(i==10){
                System.exit(0);
            }
        }
    }
}
