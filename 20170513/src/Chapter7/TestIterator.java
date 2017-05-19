package Chapter7;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {
		
		Collection books = new HashSet();
		books.add("企业应用实战");
		books.add("权威指南");
		books.add("宝典");
		
		Iterator it = books.iterator();
		while (it.hasNext()) {
//			System.out.println(it.next());
			String book = (String)it.next();
			System.out.println(book);
			if (book.equals("权威指南")) {
				it.remove();
			}
			//对book变量赋值，不会改变集合元素本身
			book = "测试字符串";
			
		}
		System.out.println(books);
		
	}

}





