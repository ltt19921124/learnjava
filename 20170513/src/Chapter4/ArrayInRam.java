package Chapter4;

public class ArrayInRam {

	public static void main(String[] args) {
		
		int[] a = {5,7,20};
		int[] b = new int[4];
		
		System.out.println("b数组的长度:" + b.length);//4
		
		//for输出a数组的元素
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[1]);
		}
		//for输出b数组的长度
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		//让b引用指向a引用指向的数组
		b = a;
		System.out.println("b数组的长度为:" + b.length);//3
		
	}

}
