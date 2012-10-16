
public class RedheadDuck extends Duck {
	
	public RedheadDuck()
	{
		flyBehavior = new FlyWithWings();
		quackBehavior = new CanQuack();
		walkBehavior = new CanWalk();
	}
	public void display()
	{
		System.out.println("RedheadDuck");
	}
}
