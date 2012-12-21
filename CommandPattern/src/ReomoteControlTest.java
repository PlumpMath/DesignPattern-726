public class ReomoteControlTest {

	public static void main(String[] args) {
		Light light = new Light();
		Garage garage = new Garage();
		
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		LightOnCommand lightOnCommand =new LightOnCommand(light);		
		GarageDoorCloseCommand closeCommand = new GarageDoorCloseCommand(garage);
		GarageDoorOpenCommand openCommand = new GarageDoorOpenCommand(garage);		
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		remote.setCommand(lightOnCommand);
		remote.buttonWasPressed();		
		remote.setCommand(lightOffCommand);
		remote.buttonWasPressed();		
		remote.setCommand(closeCommand);
		remote.buttonWasPressed();		
		remote.setCommand(openCommand);
		remote.buttonWasPressed();
		
		
		RemoteControl remoteControl = new RemoteControl();
		remoteControl.setCommand(2, lightOffCommand, lightOnCommand);
		remoteControl.onButtonWasPressed(2);
	}
}
