package Chapter6;

class Apple {
	private String color;
	private double weight;
	public Apple() {
		
	}
	
	public Apple(String color,double weight) {
		this.color = color;
		this.weight = weight;
	}
	//��Object�ķ�����ӡ������+@+hashcodeֵ
	//����toString���������Լ�ʵ��
	public String toString() {
		return "һ��ƻ��,��ɫ��:" + color + ",������:" + weight;
	}
	
}

	
class TestToString {

	public static void main(String[] args) {
		
		Apple a = new Apple("��ɫ",5.68);
		System.out.println(a);
		
	}

}