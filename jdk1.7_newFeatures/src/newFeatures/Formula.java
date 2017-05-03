package newFeatures;

interface Formula {
	
	public double calculate(int a);
	
	default double sqrt(int a){
		return Math.sqrt(a);
	}
}
