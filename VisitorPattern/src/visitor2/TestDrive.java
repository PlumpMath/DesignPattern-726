package visitor2;

class TestDrive {

	static public void main(String[] args) {
		Java java = new Java();
		JavaFeatureVisitor learnJavaFeature = new JavaFeatureReadVisitor();
		JavaFeatureVisitor implJavaFeature = new JavaFeatureImplVisitor();
		learnJavaFeature.visitJavaFeatures(java);
		implJavaFeature.visitJavaFeatures(java);
	}
}