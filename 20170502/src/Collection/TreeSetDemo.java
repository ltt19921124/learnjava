package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		
		/*
		 * ��person����������д�С�����������
		 * 
		 * 
		 */
		
		ts.add(new Person("zhansan",28));
		ts.add(new Person("wangwu",29));
		ts.add(new Person("zhaoliu",24));
		ts.add(new Person("zhousi",28));
		
		
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			Person p = (Person) it.next();
			
			System.out.println(p.getName() + "..." + p.getAge());
			
		}
		
	}

}


