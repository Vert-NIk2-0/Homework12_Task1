import java.util.concurrent.atomic.AtomicInteger;

public class Page implements Runnable{
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "check page!");
            atomicInteger.incrementAndGet();
        }
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }
}
