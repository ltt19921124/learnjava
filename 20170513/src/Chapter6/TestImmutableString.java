package Chapter6;

public class TestImmutableString {

	public static void main(String[] args) {
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		//输出false
		System.out.println(str1 == str2);
		//输出true
		System.out.println(str1.equals(str2));
		//下面两句语句输出的hashcode相同
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
	}

}
