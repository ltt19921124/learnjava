package Chapter6;

public class TestEqual {

	public static void main(String[] args) {
		
		int it = 65;
		float f = 65.0f;
		System.out.println("65��65.0f�Ƿ���ȣ�:" + (it == f));//true
		char c = 'A';
		System.out.println("65��'A'�Ƿ����?:" + (it == c));
		String s = new String("hello");
		String s1 = new String("hello");
		System.out.println("s��s1�Ƿ����?:" + (s == s1));//flase
		System.out.println("s�Ƿ�equals s1?:" + (s.equals(s1)));//true
		
	}

}