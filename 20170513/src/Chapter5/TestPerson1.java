package Chapter5;

public class TestPerson1 {

	public static void main(String[] args) {
		
		
		System.out.println("person1���eyeNum������ֵ:" + Person1.eyeNum);//person1���eyeNum������ֵ:0
		//
		System.out.println(Person1.address);//null
		
		Person1 p = new Person1();
		System.out.println("p������name����ֵ��:" + p.name + "p�����eyeNum����ֵ��:" + p.eyeNum);//null...0
		p.name = "�����";
		p.eyeNum = 2;
		System.out.println("p������name����ֵ��:" + p.name + "p�����eyeNum����ֵ��:" + p.eyeNum);
		System.out.println("Person1��eyrNum������ֵ:" + Person1.eyeNum);//2
		
		Person1 p2 = new Person1();
		System.out.println("p2�����eyeNum������:" + p2.eyeNum);//2
		
		/*
		 * �����Ͽ��Կ�����
		 * 		1,��Ա����������ʽ��ʼ����
		 * 		2,������������ʵ�����Դ�����������Ĵ��ڶ����ڣ�
		 * 
		 * 
		 */
		
	}
	

}