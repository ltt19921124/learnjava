package Chapter5_Constructor;

public class TestConstructor {
	
	public String name;
	public int count;
	
	public TestConstructor(String name,int count) {
		
		//this������ǰ����
		this.name = name;
		this.count = count;
	}

	public static void main(String[] args) {
		//ʹ���Զ��幹��������������
		//ϵͳ��Ըö���ִ���Զ���ĳ�ʼ��
		TestConstructor tc = new TestConstructor("Ȩ��ָ��",2000); 
		//����ö����name��count����
		System.out.println(tc.name);
		System.out.println(tc.count);
		
	}

}