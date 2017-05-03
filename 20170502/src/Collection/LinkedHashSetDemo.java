package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		
		hs.add("haha");
		hs.add("xixi");
		hs.add("heihei");
		hs.add("hehe");
		hs.add("haha");//没有重复元素，且无序
		
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
