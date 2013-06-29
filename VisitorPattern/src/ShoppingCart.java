import java.util.ArrayList;

public class ShoppingCart {
	// normal shopping cart stuff
	private ArrayList<Visitable> items = new ArrayList<>();

	public double calculatePostage() {
		// create a visitor
		PostageVisitor visitor = new PostageVisitor();
		// iterate through all items
		for (Visitable item : items) {
			item.accept(visitor);
		}
		double postage = visitor.getTotalPostage();
		return postage;

	}

	public ShoppingCart() {
		items.add(new Book());
		items.add(new DVD());
		items.add(new CD());
	}

}