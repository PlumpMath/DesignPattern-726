package visitor2;

class Generics implements JavaFeature {

	public void accept(JavaFeatureVisitor visitor) {
		visitor.visit(this);
	}
}