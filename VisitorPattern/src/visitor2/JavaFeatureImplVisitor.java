package visitor2;

//Concrete Visitors
public class JavaFeatureImplVisitor implements JavaFeatureVisitor {

	public void visit(Collections collections) {
		System.out.println("using Collections " + collections.getName());
	}

	public void visit(Generics generics) {
		System.out.println("using Generics");
	}

	public void visitJavaFeatures(Java java) {
		System.out.println("\nImplementing Java Features");
		for (JavaFeature javaFeature : java.getJavaFeatures()) {
			javaFeature.accept(this);
		}
		System.out.println("Very useful features");
	}

}