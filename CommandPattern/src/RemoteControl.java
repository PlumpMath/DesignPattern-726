public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;

	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand();

		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		
		undoCommand=noCommand;

	}

	public void setCommand(int slot, Command offCommand, Command onCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPressed(int slot) {
		onCommands[slot].execute();
		System.out.println(toString());
		
	}

	public void offButtonWasPressed(int slot) {
		offCommands[slot].execute();
		System.out.println(toString());
	}
	
	private void undoButtonPressed() {
		undoCommand.execute();
		System.out.println(toString());
	}

	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n -------- Remote ------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuffer.append("[slot" + i + "]"
					+ onCommands[i].getClass().getName() + "   "
					+ offCommands[i].getClass().getName() + "\n");
		}
		return stringBuffer.toString();
	}

}
