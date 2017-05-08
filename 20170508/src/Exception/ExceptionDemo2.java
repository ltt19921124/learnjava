package Exception;


class FuShuIndexException extends Exception {
	
	FuShuIndexException() {
		
	}

	FuShuIndexException(String msg) {
		super(msg);
	}
}


class Demo {
	public int method(int[] arr,int index) throws FuShuIndexException {
//		System.out.println(arr[index]);//����������˶���ķ�װ
		
		if(arr == null) {
			throw new NullPointerException("��������ò���Ϊ��");
		}
		if(index >= arr.length) {
			throw new ArrayIndexOutOfBoundsException("����ĽǱ�Խ��" + index);
		}
		if(index < 0) {
			throw new FuShuIndexException("�Ǳ�Ϊ��");
		}
		return arr[index];
	}
	
}



public class ExceptionDemo2 {

	public static void main(String[] args) throws FuShuIndexException {
		
		
		int[] arr = new int[3];
		Demo d = new Demo();
		d.method(arr, -2);
		
//		method(arr,3);
		
	}

	public static void method(int[] arr, int index) {
		
		System.out.println(arr[index]);
		
	}

}








