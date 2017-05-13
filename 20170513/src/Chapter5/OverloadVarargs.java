package Chapter5;

public class OverloadVarargs {
	
	public void test(String msg) {
		System.out.println("只有一个字符串参数的test方法");
	}
	//
	//
	
	public void test(String...books) {
		System.out.println("***形参长度可变的test方法***");
	}

	public static void main(String[] args) {
		
		OverloadVarargs olv = new OverloadVarargs();
		//执行第二个test方法
		olv.test();
		olv.test("aa","bb");
		//执行第一个test方法
		olv.test("aa");
		//执行第二个test方法
		olv.test(new String[]{"aa"});
		
		
	}

}
