package Chapter5;

public class Varargs {
	
	public static void test(int a,String...books) {
		for (String tmp : books) {
			System.out.println(tmp);
		}
		//输出整形变量a的值
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		test(5,"指南","基于什么");
		
	}

}
