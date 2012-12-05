package test;

public class MainClass {

	public static void main(String[] args) {		
		AppName appName = new AppName();
		appName.performAd();
		
		appName.setShowAdBehavior(new CantShowAd());
		
		appName.performAd();
		
	}

}
