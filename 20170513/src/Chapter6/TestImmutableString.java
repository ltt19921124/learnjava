package Chapter6;

public class TestImmutableString {

	public static void main(String[] args) {
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		//���false
		System.out.println(str1 == str2);
		//���true
		System.out.println(str1.equals(str2));
		//����������������hashcode��ͬ
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
	}

}
