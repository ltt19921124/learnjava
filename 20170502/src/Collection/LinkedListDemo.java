package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList link = new LinkedList();
		
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		link.addFirst("abc4");
		System.out.println(link);
		
//		System.out.println(link.getFirst());//获取第一个但不删除
//		System.out.println(link.removeFirst());//获取第一个而且会删除
		
		while(!link.isEmpty()) {
			System.out.println(link.removeLast());
		}
		
		System.out.println(link);
//		Iterator it = link.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());//4321顺序打印出数据
//		}
		
	}

}
