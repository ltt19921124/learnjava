package Chapter7;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {
		
		Collection books = new HashSet();
		books.add("��ҵӦ��ʵս");
		books.add("Ȩ��ָ��");
		books.add("����");
		
		Iterator it = books.iterator();
		while (it.hasNext()) {
//			System.out.println(it.next());
			String book = (String)it.next();
			System.out.println(book);
			if (book.equals("Ȩ��ָ��")) {
				it.remove();
			}
			//��book������ֵ������ı伯��Ԫ�ر���
			book = "�����ַ���";
			
		}
		System.out.println(books);
		
	}

}




