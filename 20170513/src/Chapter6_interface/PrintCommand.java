package Chapter6_interface;

public class PrintCommand implements Command{

	@Override
	public void process(int[] target) {
		for (int tmp : target) {
			System.out.println("迭代输出目标属猪的元素:" + tmp);
		}
	}
	

}
