package Chapter6;

public class TestPrivateMethod {
	
	private final void test() {
		
	}

}

class Sub1 extends TestPrivateMethod {
	
	//������벻�������
	public void test() {
		//��Ϊû�м̳е������test������˽�еķ������ܼ̳У���д
	}
}

class FinalOverload {
	public final void test() {
		
	}
	public final void test(String arg) {
		
	}
}
