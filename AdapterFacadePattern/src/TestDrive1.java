import org.omg.PortableServer.AdapterActivator;


public class TestDrive1 {
	public static void main(String[] args) {
		MallardDuck mDuck = new MallardDuck();		
		WildTurkey wTurkey = new WildTurkey(); 
		
		Duck turkeyAdapter = new TurkeyAdapter(wTurkey);
		
		wTurkey.gobble();
		wTurkey.fly();
		
		mDuck.quack();
		
		turkeyAdapter.quack();
		turkeyAdapter.fly();
		
	}
	
}
