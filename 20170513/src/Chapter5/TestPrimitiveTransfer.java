package Chapter5;

public class TestPrimitiveTransfer {

	public static void swap (int a,int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("swap�����a��ֵ��:" + a + ",b��ֵ��:" + b);
	}
	public static void method(int a) {
		a = 9;
	}
	
	public static void main(String[] args) {
		int a = 6;
		int b = 9;
		swap(a,b);
		System.out.println("����������ʵ��a��ֵ��:" + a + ",b��ֵ��:" + b);
//		System.out.println(a);//6
		
	}

}