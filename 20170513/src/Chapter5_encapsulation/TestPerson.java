package Chapter5_encapsulation;

public class TestPerson {

	public static void main(String[] args) {

		Person p = new Person();
		p.setAge(1000);
		System.out.println("δ������age����ʱ:" + p.getAge());
		//�ɹ��޸�age��ֵ
		p.setAge(30);
		//��Ϊ����ɹ�������p��age���ԣ��ʴ˴����30
		System.out.println("�ɹ��������Ժ�:" + p.getAge());
		//����ֱ�Ӳ���p��name���ԣ�ֻ��ͨ������ڵ�setter����
		//��Ϊ"���"�ַ�����������2~6�����Կ��Գɹ�����
		p.setName("���������");
		System.out.println("�ɹ�����name���Ժ�:" + p.getName());
		
		
	}

}