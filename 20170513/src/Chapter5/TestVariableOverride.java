package Chapter5;

public class TestVariableOverride {
	
	/*
	 * ��Ա�����;ֲ�����ͬ�����ֲ������Ḳ�ǳ�Ա����
	 * �������ʵ����������this. ����.(��̬����)
	 * 
	 */
	
	private String name = "���";
	private static double price = 78.0;

	public static void main(String[] args) {
		
		int price = 65;
//		System.out.println(price);//65
//		System.out.println(TestVariableOverride.price);//78.0
		new TestVariableOverride().info();//
		
	}
	
	public void info () {
		
		String name = "�����";
		System.out.println(name);//
		System.out.println(this.name);//
		
	}

}






