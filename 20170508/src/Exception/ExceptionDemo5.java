package Exception;


class Demo_1 {
	
	public int show(int index) throws ArrayIndexOutOfBoundsException {
		
		if(index < 0) {
			throw new ArrayIndexOutOfBoundsException("Խ����");
		}
		int[] arr = new int[3];
		return arr[index];
	}

}


public class ExceptionDemo5 {
	
	public static void main(String[] args) {
		
	}
}