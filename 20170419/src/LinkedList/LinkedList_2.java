package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_2 {

	public static void main(String[] args) {
		
		LinkedList link = new LinkedList();
		
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		link.addFirst("abc4");
		System.out.println(link);
		
//		System.out.println(link);//[abc4, abc3, abc2, abc1]
//		System.out.println(link.getFirst());//abc4获取第一个但不删除
//		System.out.println(link.getFirst());//abc4
		
//		System.out.println(link.removeFirst());//abc4获取元素会删除
//		System.out.println(link.removeFirst());//abc3
		
		while(!link.isEmpty()) {
			System.out.println(link.removeLast());//元素也会被全部删除
		}
		
		
		System.out.println(link);
//		Iterator it = link.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		//最后插入的是abc4
		
	}

}
