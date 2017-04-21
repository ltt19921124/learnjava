package Set;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		/*
		 * 
		 * set
		 * 	--|--HashSet:内部结构是哈希表，不同步
		 *  --|--HashMap:
		 * 
		 * */
		HashSet hs = new HashSet();
		
		hs.add("haha");//无序的
		hs.add("xixi");
		hs.add("heihei");
		hs.add("hehe");
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}






