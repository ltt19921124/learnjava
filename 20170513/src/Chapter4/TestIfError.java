package Chapter4;

public class TestIfError {

	public static void main(String[] args) {
		
		int age = 45;
		if (age > 20 && age < 40) {
			System.out.println("������");
		} else if (age > 40 && age < 60) {
			System.out.println("������");
		} else if (age > 60) {
			System.out.println("������");
		}
		
	}

}
