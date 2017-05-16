package Chapter6_interface;

interface Product {
	int getProduceTime();
}

public class Printer implements Output,Product{
	private String[] printData = new String[MAX_CACHE_LINE];
	private int dataNum = 0;

	

	@Override
	public void out() {
		while (dataNum > 0) {
			
			System.out.println("��ӡ����ӡ" + printData[0]);
			//����ҵ��������ǰ����Ϊ������ʣ�µ���ҵ���һ
			System.arraycopy(printData,1,printData,0,--dataNum);
			
		}
		
	}

	@Override
	public void getData(String msg) {
		if (dataNum >= MAX_CACHE_LINE) {
			System.out.println("����������������ʧ��");
		} else {
			//�Ѵ�ӡ������ӵ�������ѱ������ݵ�������1
			printData[dataNum++] = msg;
		}
	}
	

	@Override
	public int getProduceTime() {
		
		return 45;
	}
	public static void main(String[] args) {
		//����һ��Printter���󣬵���Outputʹ��
		Output o = new Printer();
		o.getData("��������ҵӦ��ʵս");
		o.getData("struts2Ȩ��ָ��");
		o.out();
		o.getData("���ڡ�����Ajax����");
		o.getData("Ruby on Rails���ݿ���ʵս");
		o.out();
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		Object obj = p;
		
	}
	
}









