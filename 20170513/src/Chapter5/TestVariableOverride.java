package Chapter5;

public class TestVariableOverride {
	
	/*
	 * 成员变量和局部变量同名，局部变量会覆盖成员变量
	 * 如需访问实例变量。用this. 或类.(静态变量)
	 * 
	 */
	
	private String name = "李刚";
	private static double price = 78.0;

	public static void main(String[] args) {
		
		int price = 65;
//		System.out.println(price);//65
//		System.out.println(TestVariableOverride.price);//78.0
		new TestVariableOverride().info();//
		
	}
	
	public void info () {
		
		String name = "孙悟空";
		System.out.println(name);//
		System.out.println(this.name);//
		
	}

}







