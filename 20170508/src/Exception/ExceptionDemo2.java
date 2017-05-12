package Exception;

class FuShuIndexException extends Exception {

	FuShuIndexException() {

	}

	FuShuIndexException(String msg) {
		super(msg);
	}
}

class Demo {
	public int method(int[] arr, int index) throws FuShuIndexException {
		// System.out.println(arr[index]);//虚拟机进行了对象的封装

		if (arr == null) {
			throw new NullPointerException("数组的引用不能为空");
		}
		if (index >= arr.length) {
			throw new ArrayIndexOutOfBoundsException("数组的角标越界" + index);
		}
		if (index < 0) {
			throw new FuShuIndexException("角标为负");
		}
		return arr[index];
	}

}

public class ExceptionDemo2 {

	public static void main(String[] args) throws FuShuIndexException {

		int[] arr = new int[3];
		Demo d = new Demo();
		d.method(arr, -2);

		// method(arr,3);

	}

	public static void method(int[] arr, int index) {

		System.out.println(arr[index]);

	}

}
