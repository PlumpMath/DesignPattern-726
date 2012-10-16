import java.util.logging.Logger;

public class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	WalkBehavior walkBehavior;
	
	
	void setWalkBehavior(WalkBehavior wb)
	{
		walkBehavior = wb;
	}
	
	void setFlyBehavior(FlyBehavior fb)
	{
		flyBehavior = fb;
	}
	
	void setQuackBehavior(QuackBehavior qb)
	{
		quackBehavior = qb;
	}
	
	void performWalk(){
		walkBehavior.walk();
	}
	
	
	void performQuack(){
		quackBehavior.quack();
	}
	
	void performFly(){
		flyBehavior.fly();
	}
	
	public void swim() {
		System.out.println("Duck can swim");
	}
	
	public void display() {

	}
}
