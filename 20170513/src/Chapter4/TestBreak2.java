package Chapter4;

public class TestBreak2 {

	public static void main(String[] args) {
		
		//外层循环，outer作为标识符
		outer:
			for (int i = 0; i < 5; i++) {
				//内层循环
				for (int j = 0; j < 3; j++) {
					System.out.println("i的值为:" + i + "i的值为:" + j);
					if (j ==1) {
						//调出outer标志的循环
						break outer;
					}
				}
			}
	}

}
