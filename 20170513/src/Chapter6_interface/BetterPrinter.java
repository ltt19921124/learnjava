package Chapter6_interface;

public class BetterPrinter implements Output{
	private String[] printData = new String[MAX_CACHE_LINE * 2];
	private int dataNum = 0;

	@Override
	public void out() {
		while(dataNum > 0) {
			System.out.println("���ٴ�ӡ�����ڴ�ӡ:" + printData[0]);
		}
	}

	@Override
	public void getData(String msg) {
		if (dataNum >= MAX_CACHE_LINE * 2) {
			System.out.println("����������������ʧ��");
		}
		else {
			//�Ѵ�ӡ������ӵ�������ѱ������ݵ����м�1
			printData[dataNum++] = msg;
		}
	}
	

}
