package Chapter6;

public class TestPrivateMethod {
	
	private final void test() {
		
	}

}

class Sub1 extends TestPrivateMethod {
	
	//下面代码不会出问题
	public void test() {
		//因为没有继承到父类的test方法，私有的方法不能继承，重写
	}
}

class FinalOverload {
	public final void test() {
		
	}
	public final void test(String arg) {
		
	}
}
