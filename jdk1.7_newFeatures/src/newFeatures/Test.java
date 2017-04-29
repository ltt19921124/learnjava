package newFeatures;

class Test implements Formula{
	
	@Override
	public double calculate(int a) {
		
		return sqrt(a*100);
	}

	public static void main(String[] args) {
		
		Test ts = new Test();
		
		System.out.println(ts.calculate(100));
		System.out.println(ts.sqrt(16));
		
		
		
	}

	
	
}
