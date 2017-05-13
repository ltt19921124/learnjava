package Chapter5;

public class Overload {

	public void test() {
		System.out.println("无参数");
	}
	public void test(String msg) {
		System.out.println("重载的test方法:" + msg);
	}

	public static void main(String[] args) {
		
		Overload ol = new Overload();
		
		ol.test();//无参数
		ol.test("hello");//重载的test方法:hello
		
	}

}
