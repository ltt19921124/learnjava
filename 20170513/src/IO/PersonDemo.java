package IO;

/*
 * װ����ģʽ����һ�����Ĺ��ܽ�����ǿʱ���Ϳ���ʹ�ø�ģʽ��������Ľ��
 * 
 * װ�κͼ̳ж���һ�����ص㣺�����ԶԹ��ܽ�����չ
 * 
 * ������ʲô�����أ�
 * 
 * 
 * 	TextWriter:���ڲ����ı�
 *   
 * 	MediaWriter�����ڲ���ý����Դ
 *  
 * ��Ҫ�Բ����Ķ��� ������Ч�ʵ���ߣ������������ģ�����ͨ���̳жԾ���Ĺ��ܽ�����չ
 * Ч�������Ҫ���뻺�弼��
 * 
 * writer
 * 		|----TextWriter:
 * 			|----BufferedWriter:�����˻��弼���Ĳ����ı��Ķ���
 * 
 * 		|----MediaWriter:���ڲ���ý��
 * 			|----BufferedMediaWriter:������
 * 
 * �̳���ϵ��Խ��Խӷ�ף�
 * 
 * 
 */

public class PersonDemo {

	public static void main(String[] args) {
		
		Person p = new Person();
//		p.chifan();
		NewPerson p1 = new NewPerson(p);
		p1.chifan();
		
	}

}

class Person {
	
	void chifan() {
		System.out.println("�Է�");
	}
}

//��ǿperson�����ֵ�

class NewPerson {
	private Person p;
	
	NewPerson(Person p) {
		this.p = p;
	}
	
	public void chifan() {
		
		System.out.println("��θ��");
		p.chifan();
		System.out.println("���");
		
	}
	
}










