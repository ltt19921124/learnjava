package Chapter4;

public class TestContinue {

	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			System.out.println("i的值是" + i);
			if (i == 1) {
				//略过本次循环的剩下语句
				continue;
			}
			System.out.println("continue后的输出语句");
		}
	}

}
