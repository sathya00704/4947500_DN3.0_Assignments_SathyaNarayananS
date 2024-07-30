public class CommandPatternTest {

    public static void main(String[] args) {
        // Create a light instance
        Light light = new Light();

        // Create command objects
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        // Create a remote control
        RemoteControl remoteControl = new RemoteControl();

        // Set and execute commands
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton(); // Turn light on

        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton(); // Turn light off
    }
}
