package Chapter5;

public class OverloadVarargs {
	
	public void test(String msg) {
		System.out.println("ֻ��һ���ַ���������test����");
	}
	//
	//
	
	public void test(String...books) {
		System.out.println("***�βγ��ȿɱ��test����***");
	}

	public static void main(String[] args) {
		
		OverloadVarargs olv = new OverloadVarargs();
		//ִ�еڶ���test����
		olv.test();
		olv.test("aa","bb");
		//ִ�е�һ��test����
		olv.test("aa");
		//ִ�еڶ���test����
		olv.test(new String[]{"aa"});
		
		
	}

}