package Chapter4;

public class TestContinue2 {

	public static void main(String[] args) {
		
		outer:
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.println("i��ֵΪ:" + i + "j��ֵΪ:" + j);
					if (j == 1) {
						continue outer;
					}
				}
			}
	}	

}
