package Chapter5_Extends;

public class Person {
	
	//�����һ����ʼ����
	{
		int a = 6;
		if(a > 4) {
			System.out.println("Person��ʼ����:�ֲ�����a��ֵ����4");
		}
		System.out.println("Person�ĳ�ʼ����");
	}
	
	//����ڶ�����ʼ����
	{
		System.out.println("Person�ĵڶ�����ʼ����");
	}
	
	//�����޲����Ĺ�����
	public Person() {
		System.out.println("Person����޲������캯��");
	}
	//
	public static void main(String[] args) {
		
		new Person();
		
	}
	

}





