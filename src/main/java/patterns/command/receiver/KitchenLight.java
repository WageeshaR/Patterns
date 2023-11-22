package patterns.command.receiver;

public class KitchenLight {
    private boolean on;

    public boolean isOn() {
        return on;
    }

    public void on() {
        System.out.println("Turning on kitchen light");
        this.on = true;
    }

    public void off() {
        System.out.println("Turning off kitchen light");
        this.on = false;
    }
}
