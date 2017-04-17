package String;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String类的特点：
		 * 
		 * 字符串对象一旦被初始化就不会被改变
		 * 
		 * 
		 * */
		StringDemo2();
		
	}

	private static void StringDemo2() {
		
		String s = "abc";//创建abc字符串对象，在常量池中
		String s1 = new String("abc");//在堆内存中创建
		
//		System.out.println("s=" + s);
//		System.out.println("s1=" + s1);
		
		System.out.println(s==s1);//false
		System.out.println(s.equals(s1));//true,String复写了Object类中的equals方法，
		//其实就是比较字符串内容
		
		
	}

	public static void StringDemo1() {
		String s = "abc";//存储在字符串常量池中
//		s = "nba";
		
		String s1 = "abc";
		System.out.println(s==s1);//true，为什么？
//		System.out.println("s=" + s);
	}

}
