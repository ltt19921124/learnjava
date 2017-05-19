package Chapter7;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestIteratorError {

	public static void main(String[] args) {
		
		Collection books = new HashSet();
		books.add("企业应用实战");
		books.add("权威指南");
		
		Iterator it = books.iterator();
		while (it.hasNext()) {
			String book = (String)it.next();
			System.out.println(book);
			if (book.equals("权威指南")) {
				//使用迭代器迭代过程中，不可修改元素，下面代码会引发异常
				books.remove(book);
			}
		}

	}

}
