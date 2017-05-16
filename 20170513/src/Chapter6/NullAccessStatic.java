package Chapter6;

public class NullAccessStatic {
	
	private static void test() {
		System.out.println("静态方法");
	}

	public static void main(String[] args) {
		
		NullAccessStatic nas = null;
		nas.test();//静态方法

	}

}
