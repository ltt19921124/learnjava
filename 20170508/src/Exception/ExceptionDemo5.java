package Exception;

class Demo_1 {

	public int show(int index) throws ArrayIndexOutOfBoundsException {

		if (index < 0) {
			throw new ArrayIndexOutOfBoundsException("越界啦");
		}
		int[] arr = new int[3];
		return arr[index];
	}

}

public class ExceptionDemo5 {

	public static void main(String[] args) {

		Demo_1 d = new Demo_1();
		try {
			int num = d.show(-2);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
			// return;
			// System.exit(0);//有这条语句后finally代码块不会执行
		}
		/*
		 * finally有一种情况执行不到
		 * 
		 * 
		 */
		finally {
			System.out.println("finally");

		}
		System.out.println("over");
	}
}
