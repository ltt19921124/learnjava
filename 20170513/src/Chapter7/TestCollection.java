package Chapter7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestCollection {

	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		c.add("孙悟空");
		c.add(6);
		System.out.println("c集合元素个数为:" + c.size());
		c.remove(6);
		System.out.println("c集合元素个数为:" + c.size());
		System.out.println("c集合是否包含孙悟空字符串:" + c.contains("孙悟空"));
		c.add("企业应用实战");
		System.out.println("c集合的元素:" + c);//c集合的元素:[孙悟空, 企业应用实战]
		
		Collection books  = new HashSet();
		books.add("企业应用实战");
		books.add("权威指南");
		System.out.println("c集合是否包含books集合:" + c.containsAll(books));
		c.removeAll(books);
		System.out.println("c集合的元素:" + c);
		c.clear();
		System.out.println("c集合的元素:" + c);
		books.retainAll(c);
		System.out.println("books集合的元素:" + books);
		
	}

}









