package Chapter5;

public class Overload {

	public void test() {
		System.out.println("�޲���");
	}
	public void test(String msg) {
		System.out.println("���ص�test����:" + msg);
	}

	public static void main(String[] args) {
		
		Overload ol = new Overload();
		
		ol.test();//�޲���
		ol.test("hello");//���ص�test����:hello
		
	}

}