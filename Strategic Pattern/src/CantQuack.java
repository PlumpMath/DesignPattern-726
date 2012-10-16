public class CantQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Duck can't quack");		
	}
}
