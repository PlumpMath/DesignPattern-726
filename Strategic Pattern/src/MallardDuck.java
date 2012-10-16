public class MallardDuck extends Duck {
	public MallardDuck()
	{
		quackBehavior = new CanQuack();
		flyBehavior = new FlyWithWings();
		walkBehavior= new CanWalk();
	}
	
	public void display()
	{
		System.out.println("MallardDuck");
	}
}
