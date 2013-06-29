package visitor2;

public interface JavaFeatureVisitor {
	void visit(Collections collections);

	void visit(Generics generics);

	void visitJavaFeatures(Java java);
}