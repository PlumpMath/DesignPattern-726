public class TestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		CD cd = new CD();
		DVD dvd = new DVD();

		ShoppingCart cart = new ShoppingCart();

		PostageVisitor postageVisitor = new PostageVisitor();
		postageVisitor.visit(book);
		postageVisitor.visit(cd);
		postageVisitor.visit(dvd);

		System.out.println(cart.calculatePostage());
	}
}
