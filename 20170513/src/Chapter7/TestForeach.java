package Chapter7;

import java.util.Collection;
import java.util.HashSet;

public class TestForeach {

	public static void main(String[] args) {
		
		//
		Collection books = new HashSet();
		books.add(new String("企业应用实战"));
		books.add(new String("权威指南"));
		books.add(new String("宝典"));
		for (Object obj : books) {
			String book = (String)obj;
			System.out.println(book);
			if (book.equals("权威指南")) {
				//
				books.remove(book);
			}
		}
		System.out.println(books);

	}

}
