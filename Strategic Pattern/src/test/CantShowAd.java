package test;
public class CantShowAd implements ShowAdBehavior{
	@Override
	public void AdArea() {
		System.out.println("dont show ad");			
	}
}
