package Chapter5_Extends;

	/*
	 * super��this�����ܳ�����static���εķ�����
	 * static���εķ���ʱ�������
	 * 
	 */
public class Ostrich extends Bird{
	int a = 5;
	
	//��д�˸����fly����
	public void fly() {
		System.out.println("��ֻ���ڵ�����...");
	}

	public static void main(String[] args) {
		
		//��������
		Ostrich os = new Ostrich();
		//ִ��fly������
//		os.fly();//��ֻ���ڵ�����...
		
		os.callOverrideMethod();//����������ɵķ���...
		
	}
	public void callOverrideMethod() {
		//�����෽����ͨ��super��ʽ���ø��౻���ǵķ���
		super.fly();//
	}

}
