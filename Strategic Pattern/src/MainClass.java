
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MallardDuck mallardDuck = new MallardDuck();
		RedheadDuck redheadDuck = new RedheadDuck();
		RubberDuck rubberDuck = new RubberDuck();
		
		
		mallardDuck.performFly();
		mallardDuck.performQuack();		
		mallardDuck.performWalk();
		
		mallardDuck.setFlyBehavior(new FlyNoWay());		
		mallardDuck.performFly();
		
		redheadDuck.performFly();
		redheadDuck.performWalk();
		
		rubberDuck.performFly();
		rubberDuck.performWalk();
		rubberDuck.performQuack();
		rubberDuck.setWalkBehavior(new CanWalk());
		rubberDuck.performWalk();
	}

}
