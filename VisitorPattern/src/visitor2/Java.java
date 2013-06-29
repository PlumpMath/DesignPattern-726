package visitor2;

public class Java {

	JavaFeature[] javaFeatures;

	public JavaFeature[] getJavaFeatures() {
		return javaFeatures.clone();
	}

	public Java() {
		this.javaFeatures = new JavaFeature[] { new Collections(" List "),
				new Collections(" Set "), new Collections(" Map "),
				new Generics() };
	}
}