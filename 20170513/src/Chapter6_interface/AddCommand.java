package Chapter6_interface;

public class AddCommand implements Command{

	@Override
	public void process(int[] target) {
		int sum = 0;
		for (int tmp : target) {
			sum += tmp;
		}
		System.out.println("����Ԫ�ص��ܺ���:" + sum);
	}

}
