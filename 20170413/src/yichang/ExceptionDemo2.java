package yichang;


class Demo {
	public int method(int[] arr,int index) {
		
//		System.out.println(arr[index]);
//		System.out.println("haha");
		if(arr == null) {
			throw new NullPointerException("数组引用不能为空");
		}
		if (index >= arr.length) {
			throw new ArrayIndexOutOfBoundsException("数组" + index);
		}
		if (index < 0) {
			throw new ArrayIndexOutOfBoundsException("数组角标不能为负数...!" + index);
		}
		return arr[index];
	}
}

public class ExceptionDemo2 {
	public static void main(String[] args){
		int[] arr = new int[3];
//		arr = null;
		Demo d = new Demo();
		int num = d.method(null, -30);
//		d.method(arr, 3);
		System.out.println("num=" + num);
		System.out.println("over");
		
	}
	
	
	
}
