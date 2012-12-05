package test;

public class Game {	
	ShowAdBehavior showAdBehavior;
	
	void setShowAdBehavior(ShowAdBehavior qb)
	{
		showAdBehavior = qb;
	}	
	
	void performAd(){
		showAdBehavior.AdArea();
	}	
		
	public void display() {

	}
}
