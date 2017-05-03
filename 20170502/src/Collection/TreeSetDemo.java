package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		//不同步的，对set集合中的元素进行排序，不同步的
		TreeSet ts = new TreeSet();
		
		ts.add("abc");
		ts.add("zaa");
		ts.add("aa");
		ts.add("nba");
		ts.add("cba");
		
		//使用元素的自然顺序排序
		
		Iterator it  = ts.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
