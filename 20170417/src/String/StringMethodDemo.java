package String;

public class StringMethodDemo {
	
	public static void main(String[] args){
		
		/*
		 * 字符串功能进行分类
		 * "abcd"
		 * 1,获取
		 * 
		 * 
		 * 1.4获取字符串中的一部分字符串，也叫子串
		 * 	String (int int);
		 * 
		 * 
		 * 2,转换
		 *  2.1，将字符串变成数组(字符串切割)
		 *  	正则表达式
		 *  2.2 将字符串转成字符数组
		 *  	
		 *  2.3将字符串变成字符数组
		 *  2.5
		 *  2.6将字符串两端的空格去除，
		 *  2.7连接字符串
		 *3，判断
		 *	3.1
		 *  3.2
		 *    
		 *
		 */
	
		stringMethodDemo_4();
		
	}

	private static void stringMethodDemo_4() {
		// TODO Auto-generated method stub
		
		System.out.println("a".compareTo("A"));//32
		System.out.println("a".compareTo("C"));
		System.out.println("abc".compareTo("aqz"));
		
		
	}

	private static void stringMethodDemo_3() {
		// TODO Auto-generated method stub
		
		String s = "aBc";
//		System.out.println(s.equals("ABC"));//falsr
//		System.out.println(s.equalsIgnoreCase("ABC"));//true(忽略大小写)
		
//		System.out.println(s.contains("Bc"));//true
//		System.out.println(s.startsWith("a"));//true
		
		String str = "ArrayDemo.java";
		
		System.out.println(str.startsWith("array"));//false
		System.out.println(str.endsWith(".java"));
		System.out.println(str.contains("Demo"));
		
	}

	private static void stringMethodDemo_2() {
		
		String s = "张三,李四,王五";
		String[] arr = s.split("\\.");//特殊表达式
//		System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
		}
		
		char[] chs = s.toCharArray();
		for (int i = 0; i < chs.length; i++) {
//			System.out.println(chs[i]);
		}
		
		s = "ab你";
		byte[] bytes = s.getBytes();
		for (int i = 0; i < bytes.length; i++) {
//			System.out.println(bytes[i]);//
		}
		
//		System.out.println("Abc".toUpperCase());
//		System.out.println("Abc".toLowerCase());
		
		String s1 = "java";
		String s2 = s1.replace('q', 'z');
//		System.out.println(s1==s2);//true
//		System.out.println("java".replace('a', 'o'));
//		System.out.println("java".replace('k', 'o'));//java返回原来的字符串
		
//		System.out.println("  -   r  abc    -   ".trim());//去除两端空格
//		System.out.println("abc".concat("kk"));//abckk
//		System.out.println("abc" + "kk");//abckk
		System.out.println(4+1);//5
		System.out.println(String.valueOf(4) + 1);//41(字符串)
		System.out.println("" + 4 + 1);//41
		
	}

	private static void stringMethodDemo_1() {
		
		String s = "abcdea";
		System.out.println("length:" + s.length());//length:6
		System.out.println("char:" + s.charAt(2));//c
		System.out.println("index:" + s.indexOf('a'));//0
		System.out.println("index:" + s.indexOf('k'));//-1
		System.out.println(s.indexOf(s));
		System.out.println("lastIndex:" + s.lastIndexOf('a'));//4
		
		System.out.println("subString:" + s.substring(2,4));
	}
	
}




