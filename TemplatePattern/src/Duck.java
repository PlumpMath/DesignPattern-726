import java.util.logging.Logger;

public class Duck implements Comparable {
	String Name;
	int Weight;

	public Duck(String name, int weight) {
		this.Name = name;
		this.Weight = weight;
	}

	public String toString() {

		return Name + " weight :" + Weight;
	}

	@Override
	public int compareTo(Object o) {
		Duck otherDuck = (Duck) o;
		int res = 0;

		if (this.Weight < otherDuck.Weight) {
			res = -1;
		} else if (this.Weight == otherDuck.Weight) {
			res = 0;
		} else if (this.Weight > otherDuck.Weight) {
			res = 1;
		}
		return res;
	}
}
