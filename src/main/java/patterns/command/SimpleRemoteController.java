package patterns.command;

import patterns.command.receiver.KitchenLight;
import patterns.command.receiver.LivingRoomLight;

public class SimpleRemoteController {
    Command[] slots;

    public SimpleRemoteController() {
        slots = new Command[4];
        slots[0] = () -> (new LivingRoomLight()).on();
        slots[1] = () -> (new LivingRoomLight()).off();
        slots[2] = () -> (new KitchenLight()).on();
        slots[3] = () -> (new KitchenLight()).off();

    }

    public void buttonWasPressed(int slot) {
        slots[slot].execute();
    }
}
