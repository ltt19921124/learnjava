package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkeLlistDemo {

	public static void main(String[] args) {
		
		LinkedList<String> link = new LinkedList<String>();
		
		link.addFirst("abc1");//头位置
		link.addFirst("abc2");
		link.addFirst("abc3");
		link.addFirst("abc4");
//		System.out.println(link);
		
//		System.out.println(link.removeFirst());//abc4,获取元素，但是会改变长度
//		System.out.println(link.removeFirst());//abc3
		
//		System.out.println(link);//link.addFirst("abc1");
//		System.out.println(link.getFirst());//abc4,获取第一个元素
//		System.out.println(link.getFirst());//abc4
//		Iterator it = link.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());//顺序是4321
//		}
		
//		while(!link.isEmpty()) {
//			System.out.println(link.removeFirst());
//		}
		
//		while(!link.isEmpty()){
//			System.out.println(link.removeLast());
//		}
		//遍历方式一
//		String[] strArray = new String[link.size()];
//		link.toArray(strArray);
//		for(String str : strArray){
//			System.out.println(str);
//		}
		
		//遍历方式二
//		for(String str : link){
//			System.out.println(str);
//		}
		
		//遍历方式三
		
//		System.out.println(link);
	}

}











