package Chapter4;

public class TsetReturn {

	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			System.out.println("i��ֵ��:" + i);
			if (i == 1) {
				return;
			}
			System.out.println("continue���������");
		}
	}

}
