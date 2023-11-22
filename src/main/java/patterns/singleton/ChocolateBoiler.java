package patterns.singleton;

public class ChocolateBoiler {
    private volatile static ChocolateBoiler uniqueInstance;
    private boolean filled;
    private boolean boiled;
    private long innitThreadId;

    private ChocolateBoiler(long threadId) {
        filled = false;
        boiled = false;
        innitThreadId = threadId;
    };

    public static ChocolateBoiler getInstance(long threadId) {
        if (uniqueInstance == null) {
            synchronized (ChocolateBoiler.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoiler(threadId);
                }
            }
        }
        return uniqueInstance;
    }

    public boolean isFilled() {
        return filled;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void drain() {
        if (isFilled() && isBoiled()) {
            System.out.println("Draining all the good, boiled chocolate");
            filled = false;
        }
    }

    public void boil() {
        if (! isBoiled() && isFilled()) {
            System.out.println("Boiling 500 gallons of hot chocolate");
            boiled = true;
        }
    }

    public void fill() {
        System.out.println("I'm initialized by the thread " + innitThreadId);
        if (! isFilled() && ! isBoiled()) {
            System.out.println("Filling out the boiler with 500 gallons of chocolate mix");
            filled = true;
        }
    }
}
