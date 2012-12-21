public class GarageDoorCloseCommand implements Command{
	Garage garage;
	
	public GarageDoorCloseCommand(Garage garage) {
		this.garage=garage;
	}	
	
	public void execute() {	
		garage.doorClose();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}	
}
