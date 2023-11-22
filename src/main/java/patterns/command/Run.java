package patterns.command;

public class Run {
    public static void main(String[] args) {
        SimpleRemoteController remoteController = new SimpleRemoteController();
        remoteController.buttonWasPressed(0);
        remoteController.buttonWasPressed(2);
        remoteController.buttonWasPressed(1);
        remoteController.buttonWasPressed(3);
    }
}
