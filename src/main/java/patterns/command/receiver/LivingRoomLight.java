package patterns.command.receiver;

public class LivingRoomLight {
    private boolean on;

    public boolean isOn() {
        return on;
    }

    public void on() {
        System.out.println("Turning on living room light");
        this.on = true;
    }

    public void off() {
        System.out.println("Turning off living room light");
        this.on = false;
    }
}
