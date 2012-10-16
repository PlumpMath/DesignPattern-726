public class RubberDuck extends Duck {
	
	public RubberDuck()
	{
		flyBehavior = new FlyNoWay();
		quackBehavior = new CanQuack();
		walkBehavior = new CantWalk();
	}
	
	public void display()
	{
		System.out.println("RubberDuck");
	}
}
