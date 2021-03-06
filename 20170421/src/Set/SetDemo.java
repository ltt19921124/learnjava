package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetDemo {

	public static void main(String[] args) {
		/*
		 * 
		 * set
		 * 	--|--HashSet:内部结构是哈希表，不同步
		 *  --|--HashMap:
		 * 
		 * */
		LinkedHashSet<String> h = new LinkedHashSet<String>();
		h.add("saa");
		
		HashSet<String> hs = new HashSet<String>();
		
		String str = "";
		str.hashCode();
		
		hs.add("haha");//无序的，元素不重复
		hs.add("xixi");
		hs.add("heihei");
		hs.add("hehe");
		hs.add("hehe");
		
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}






