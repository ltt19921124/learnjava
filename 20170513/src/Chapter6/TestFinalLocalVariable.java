package Chapter6;

public class TestFinalLocalVariable {
	
	public void test(final int a) {
		//不能对final修饰的形参赋值，下面这一条语句非法
//		a = 5;
	}

	public static void main(String[] args) {
		
		final String str = "hello";
		final double d;
		d = 5.6;
		
	}

}
