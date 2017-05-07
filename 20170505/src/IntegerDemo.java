
public class IntegerDemo {

	public static void main(String[] args) {
		
		
//		Integer i = new Integer(5);
//		Integer i2 = new Integer(5);
//		System.out.println(i == i2);//false
//		
//		Integer i3 = 8;
//		Integer i4 = 8;
//		System.out.println(i3 == i4);//true
//		
//		Integer i5 = 128;
//		Integer i6 = 128;
//		System.out.println(i5 == i6);//false
//		
//		Boolean b1 = true;
//		Boolean b2 = true;//也使用了常量池技术
//		System.out.println(b1 == b2);//true
//		
//		Double d1 = 1.0;
//		Double d2 = 1.0;//没有使用常量池技术
//		System.out.println(d1 == d2);//false
//		method();
		method_1();
	}
	
	public static void method_1() {
		
		int num = 4;
		Integer i = 4;//i = new Integer(4);   自动装箱
		
		Integer i1 = 4;
		i1 = i1 + 4;
		
//		Integer a = new Integer(127);
//		Integer b = new Integer(127);
//		System.out.println(a == b);
//		System.out.println(a.equals(b));
		
		Integer x = 127;
		Integer y = 127;
		System.out.println(x == y);//true
		System.out.println(x.equals(y));
		
	}

	public static void method() {
		
		Integer i = new Integer(3);
		Integer i2 = new Integer("3");
		System.out.println(i.compareTo(i));//0
		System.out.println(i == i2);
		System.out.println(i.equals(i2));
		
		
		
//		System.out.println(Integer.MAX_VALUE);
//		
//		System.out.println(Integer.toBinaryString(-6));
//		System.out.println(Integer.parseInt("123") + 1);//124
//		int i = 9;
//		int a = Integer.parseInt("124") + 1;
//		System.out.println(Integer.parseInt("123") + 1);//124
		
//		boolean b = Boolean.parseBoolean("true");
//		
//		Integer i3 = new Integer("123");
//		
//		System.out.println(i3.intValue());
	
//		System.out.println(Integer.toBinaryString(60));
//		System.out.println(Integer.toHexString(60));
//		System.out.println(Integer.toOctalString(17));
//		System.out.println(Integer.toString(60, 16));
		
	}
}













