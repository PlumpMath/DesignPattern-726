public class GarageDoorOpenCommand implements Command{
	Garage garage;
	
	public GarageDoorOpenCommand(Garage garage) {
		this.garage = garage;
	}	
	
	public void execute() {	
		garage.doorOpen();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}	
}
