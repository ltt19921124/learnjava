package Chapter7;

import java.util.Collection;
import java.util.HashSet;

public class TestForeach {

	public static void main(String[] args) {
		
		//
		Collection books = new HashSet();
		books.add(new String("��ҵӦ��ʵս"));
		books.add(new String("Ȩ��ָ��"));
		books.add(new String("����"));
		for (Object obj : books) {
			String book = (String)obj;
			System.out.println(book);
			if (book.equals("Ȩ��ָ��")) {
				//
				books.remove(book);
			}
		}
		System.out.println(books);

	}

}
