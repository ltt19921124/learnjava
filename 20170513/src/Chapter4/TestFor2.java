package Chapter4;

public class TestFor2 {

	public static void main(String[] args) {
		
//		ThisInConstructor c = new ThisInconstructor();
		
		for (int b = 0, s = 0, p = 0; b < 10 && s < 4 && p < 10; p++) {
			System.out.println(b++);
			System.out.println(++s + p);
		}
	}

}
