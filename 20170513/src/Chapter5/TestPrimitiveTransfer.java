package Chapter5;

public class TestPrimitiveTransfer {

	public static void swap (int a,int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("swap方法里，a的值是:" + a + ",b的值是:" + b);
	}
	public static void method(int a) {
		a = 9;
	}
	
	public static void main(String[] args) {
		int a = 6;
		int b = 9;
		swap(a,b);
		System.out.println("交换结束后，实参a的值是:" + a + ",b的值是:" + b);
//		System.out.println(a);//6
		
	}

}
