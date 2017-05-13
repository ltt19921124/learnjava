package Chapter5;

public class StaticAccessNonStatic {
	
	public void info() {
		System.out.println("简单的info方法");
	}

	public static void main(String[] args) {
		//main方法时静态的，erinfo()方法时非静态的，访问会出错
//		info();//Cannot make a static reference to the non-static method info() from the type
		
		new StaticAccessNonStatic().info();
	}

}
