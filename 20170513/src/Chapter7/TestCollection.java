package Chapter7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestCollection {

	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		c.add("�����");
		c.add(6);
		System.out.println("c����Ԫ�ظ���Ϊ:" + c.size());
		c.remove(6);
		System.out.println("c����Ԫ�ظ���Ϊ:" + c.size());
		System.out.println("c�����Ƿ����������ַ���:" + c.contains("�����"));
		c.add("��ҵӦ��ʵս");
		System.out.println("c���ϵ�Ԫ��:" + c);//c���ϵ�Ԫ��:[�����, ��ҵӦ��ʵս]
		
		Collection books  = new HashSet();
		books.add("��ҵӦ��ʵս");
		books.add("Ȩ��ָ��");
		System.out.println("c�����Ƿ����books����:" + c.containsAll(books));
		c.removeAll(books);
		System.out.println("c���ϵ�Ԫ��:" + c);
		c.clear();
		System.out.println("c���ϵ�Ԫ��:" + c);
		books.retainAll(c);
		System.out.println("books���ϵ�Ԫ��:" + books);
		
	}

}









