package String;

public class StringConstrucDemo {
	
	public static void main(String[] args) {
		
		stringConstrucorDeno2();
		
	}

	private static void stringConstrucorDeno2() {
		
		char[] arr = {'w','a','p','q','x'};
		String s = new String(arr,1,3);//将数组变成字符串，取几个
		System.out.println(s);
		
	}

	private static void stringConstrucorDeno() {
		
		String s = new String();//等效于String s = "";注意：不等效于:String s = null;
		
		byte[] arr = {97,66,67,68};
		String s1 = new String(arr);//将字节数组变成字符串
		System.out.println("s1=" + s1);//aBCD
		
	}
	
}
