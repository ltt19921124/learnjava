package Chapter6;

public class NullAccessStatic {
	
	private static void test() {
		System.out.println("��̬����");
	}

	public static void main(String[] args) {
		
		NullAccessStatic nas = null;
		nas.test();//��̬����

	}

}
