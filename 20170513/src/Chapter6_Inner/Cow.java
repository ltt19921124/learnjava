package Chapter6_Inner;

public class Cow {
	
	private double weigth;
	public Cow() {
		
	}
	public Cow(double weight) {
		this.weigth = weight;
	}
	//����һ���Ǿ�̬�ڲ���
	private class CowLeg {
		//�Ǿ�̬�ڲ������������
		private double length;
		private String color;
		//�Ǿ�̬�ڲ�����������ع�����
		public CowLeg() {
			
		}
		public CowLeg(double length,String color) {
			this.length = length;
			this.color = color;
		}
		//
		public double getLength() {
			return length;
		}
		public void setLength(double length) {
			this.length = length;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		//�Ǿ�̬�ڲ����ʵ������
		public void info() {
			System.out.println("��ǰţ����ɫ��:" + color + ",��:" + length);
		}
		
		
	}
	public void test() {
		
		CowLeg cl = new CowLeg(1.12,"�ڰ����");
		cl.info();
	}
	
	public static void main(String[] args) {
		Cow cow = new Cow(378.9);
		cow.test();
		
	}

}



















