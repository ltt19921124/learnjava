package String;

public class StringObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("abc");
		String s2 = s1.intern();
//		System.out.println(s1 == s2);//true
		
		//intern():对字符串池进行操作，返回字符串的规范化表现形式
		System.out.println(s1 == s2);//false
		
//		String s3 = "abc";
//		String s4 = "abc";
//		System.out.println(s3==s4);//true
		
	}



}
