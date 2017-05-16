package Chapter6_Inner;

abstract class Device {
	private String name;
	public abstract double getPrice();
	public Device(){
		
	}
	public Device(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class AnonymousInner {
	public void test(Device d) {
		
		System.out.println("������һ��" + d.getName() + ",������" + d.getPrice());
	}
	public static void main(String[] args) {
		
		AnonymousInner ai = new AnonymousInner();
		ai.test(new Device("����ʾ����") {
			public double getPrice() {
				return 67.8;
			}
		});
		//�����޲����Ĺ���������Device����ʵ����Ķ���
		Device d = new Device(){
			//��ʼ����
			{
				System.out.println("�����ڲ���ĳ�ʼ����...");
			}
			//ʵ�ֳ��󷽷�
			public double getPrice() {
				return 56.2;
			}
			//��д�����ʵ������
			public String getName() {
				return "����";
			}
		};
		ai.test(d);
		
	}

}










