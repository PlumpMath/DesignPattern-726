package visitor2;

class Collections implements JavaFeature {

	private String name;

	Collections(String name) {
		this.name = name;
	}

	String getName() {
		return this.name;
	}

	public void accept(JavaFeatureVisitor visitor) {
		visitor.visit(this);
	}
}