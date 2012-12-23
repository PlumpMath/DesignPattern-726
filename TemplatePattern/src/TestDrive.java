import java.util.Arrays;

public class TestDrive {
	public static void main(String[] args) {
		Duck[] ducks = { new Duck("1", 1), new Duck("3", 3), new Duck("5", 5),
				new Duck("2", 2), new Duck("4", 4) };

		System.out.println("before sorting");
		display(ducks);
				
		System.out.println("after sorting");
		Arrays.sort(ducks);
		
		display(ducks);
	}

	public static void display(Duck[] duck) {
		for (int i = 0; i < duck.length; i++) {
			System.out.println(duck[i]);
		}
	}
}
