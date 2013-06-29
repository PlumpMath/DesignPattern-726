package visitor2;

//Concrete Visitors
public class JavaFeatureReadVisitor implements JavaFeatureVisitor {

	public void visit(Collections collections) {
		System.out.println("Going through " + collections.getName()
				+ " Collections");
	}

	@Override
	public void visit(Generics generics) {
		System.out.println("Going through  generics");
	}

	public void visitJavaFeatures(Java java) {
		System.out.println("\nLearning Java");
		for (JavaFeature javaFeature : java.getJavaFeatures()) {
			javaFeature.accept(this);
		}
		System.out.println("Got an Idea of Java Language");
	}

}