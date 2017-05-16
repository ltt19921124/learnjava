package Chapter6;

public class TestFinalMethod {
	public final void test() {
		
	}

}

class Sub extends TestFinalMethod {
	
	//出错，不能对final修饰的方法进行覆盖
//	public void test() {
//		
//	}
	
}
