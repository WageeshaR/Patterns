package patterns.singleton;

public class Run extends Thread {
    public void run() {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance(Thread.currentThread().getId());
        boiler.fill();
    }

    public static void main(String[] args) throws InterruptedException {
        Run thread1 = new Run();
        Run thread2 = new Run();

        thread1.start();
        thread2.start();

        thread1.join();
    }
}
