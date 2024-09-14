import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        Page page = new Page();

        Thread thread1 = new Thread(page, "Thread 1");
        Thread thread2 = new Thread(page, "Thread 2");

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Number of views: " + page.getAtomicInteger());
    }
}