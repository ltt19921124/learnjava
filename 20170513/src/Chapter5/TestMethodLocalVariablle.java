package Chapter5;

public class TestMethodLocalVariablle {

	public static void main(String[] args) {
		
		int a;
//		System.out.println("方法局部变量a的值为:" + a);//错误，因为a还未初始化
		a = 5;
		System.out.println("方法局部变量a的值:" + a);//方法局部变量a的值:5
	}

}
