package Chapter5;

public class Varargs {
	
	public static void test(int a,String...books) {
		for (String tmp : books) {
			System.out.println(tmp);
		}
		//������α���a��ֵ
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		test(5,"ָ��","����ʲô");
		
	}

}