package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetDemo {

	public static void main(String[] args) {
		/*
		 * 
		 * set
		 * 	--|--HashSet:�ڲ��ṹ�ǹ�ϣ������ͬ��
		 *  --|--HashMap:
		 * 
		 * */
		LinkedHashSet<String> h = new LinkedHashSet<String>();
		h.add("saa");
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("haha");//����ģ�Ԫ�ز��ظ�
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





